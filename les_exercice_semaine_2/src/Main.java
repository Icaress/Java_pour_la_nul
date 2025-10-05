//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Chien chien = new Chien("Golden");
        Os os = new Os("os à moèlle");
        Master master = new Master("Kanto");

        chien.manger(os);
        master.donner_Os(chien,os);

        System.out.println("Maitre " + master.name);
        System.out.println("race du chien : " + chien.race);
        System.out.println("type d'os : " + os.type_Os);
    }
}
class Os{
    String type_Os;
    public Os(String type_Os){
        this.type_Os = type_Os;
    }
}
class Chien{
    String race;
    public Chien(String race){
        this.race = race;
    }
    public void manger(Os os){
        System.out.println("Le chien de race " + race + " mange le type d'os : " + os.type_Os);
    }
}
class Master{
    String name;
    public Master(String name){
        this.name = name;
    }

    public void donner_Os(Chien chien,Os os){
        System.out.println("Le maitre " + name + " a donné un os de type " + os.type_Os);
        chien.manger(os);
    }
}

class Article{
    public String nom_article;
    public int numero_article;
    public Entrepot entrepot;
    public Article(String nom_article,int numero_article){
        this.nom_article = nom_article;
        this.numero_article = numero_article;
    }
    public void stocker(Entrepot entrepot1){
        this.entrepot = entrepot1;
    }
}
class Entrepot{
    public String nom;
    public Article[] article;
    public int nombre_article;

    public Entrepot(String nom){
        this.nom = nom;
        this.article = new Article[3];
        this.nombre_article = 0;
    }
    public void garder(Article article1){
        if (nombre_article < 3){
            article[nombre_article] = article1;
            nombre_article ++;
            article1.entrepot = this;
        }else {
            System.out.println("Impossible d'ajouter l'article " + article1.nom_article + " " + article1.numero_article + " stockage de l'entrepot " + this.nom + " a atteint son stockage maximum");
        }
    }
}

class exo_2_et_exo_3_Main{
    public static void main(String [] args){
        Entrepot entrepot = new Entrepot("Walmart");
        Article article = new Article("La baguette",15648565);
        Article article1 = new Article("Chien a Kanto", 1544569584);
        Article article2 = new Article("Gros Camion" , 95489654);
        Article article3 = new Article("jouet", 95456954);

        article.stocker(entrepot);

        entrepot.garder(article);
        entrepot.garder(article1);
        entrepot.garder(article2);
        entrepot.garder(article3);

        System.out.println("l'article est stocké dans l'entrepot " + article.entrepot.nom + " et voici les ID de l'article : " + article.numero_article + " " + article.nom_article);
        System.out.println("Les article garder dans l'entrepot " + entrepot.nom + " sont de nombre " + entrepot.nombre_article + " :");
        for(int i = 0; i<entrepot.nombre_article;i++){
            System.out.println("Article " + i + " : " + entrepot.article[i].nom_article + " " + entrepot.article[i].numero_article);
        }
    }
}
class Livre{
    public String titre;
    public Oeuvre oeuvre;
    public Livre(String titre){
        this.titre = titre;
    }
    public void issu(Oeuvre oeuvre1){
        this.oeuvre = oeuvre1;
    }
}
class Oeuvre{
    public String nom;
    public Livre[] livre;
    public int nombre_livre;

    public Oeuvre(String nom){
        this.nom = nom;
        this.livre = new Livre[3];
        this.nombre_livre = 0;
    }
    public void donnerIssue(Livre livre1){
        if (nombre_livre<3){
            livre[nombre_livre] = livre1;
            nombre_livre ++;
            livre1.oeuvre = this;
        }else{
            System.out.println("Impossible d'ajouter le livre " + livre1.titre + " à l'oeuvre " + this.nom + " car il a atteint sa quantité maximum d'espace");
        }
    }
}
class exo_5_main{
    public static void main(String [] args){
        Oeuvre oeuvre = new Oeuvre("Albert Camus");
        Livre livre = new Livre("The Stranger");
        Livre livre1 = new Livre("The Fall");
        Livre livre2 = new Livre("The plague");
        Livre livre3 = new Livre("The Rebel");

        livre.issu(oeuvre);

        oeuvre.donnerIssue(livre);
        oeuvre.donnerIssue(livre1);
        oeuvre.donnerIssue(livre2);
        oeuvre.donnerIssue(livre3);

        System.out.println("Les livre stocké dans l'oeuvre " + oeuvre.nom + " sont au nombre de " + oeuvre.nombre_livre);
        for(int i = 0;i<oeuvre.nombre_livre;i++){
            System.out.println(oeuvre.livre[i].titre);
        }
    }
}
