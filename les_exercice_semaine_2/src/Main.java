import java.util.Scanner;

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
    public void donnerLieu(Livre livre1){
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

        oeuvre.donnerLieu(livre);
        oeuvre.donnerLieu(livre1);
        oeuvre.donnerLieu(livre2);
        oeuvre.donnerLieu(livre3);

        System.out.println("Les livre stocké dans l'oeuvre " + oeuvre.nom + " sont au nombre de " + oeuvre.nombre_livre);
        for(int i = 0;i<oeuvre.nombre_livre;i++){
            System.out.println(oeuvre.livre[i].titre);
        }
    }
}
class Man{
    public String name;
    public Man(String name){
        this.name = name;
    }
}
class Woman{
    public String name;
    public Woman(String name){
        this.name = name;
    }
}
class Marriage{//je te conseil de bien apprendre cette class en vrai c'est la plus dure que j'ai crée depuis le début
    public String date;
    public String place;
    public Contract contrat;
    public Marriage(Scanner sc,String place){
        int[] table_of_marriage = request_date(sc);
        this.date = table_of_marriage[0] + "/" + table_of_marriage[1] + "/" + table_of_marriage[2];
        this.place = place;
    }
    public void passer(Contract contract){
        this.contrat = contract;
        System.out.println("Le contrat a été passer avec succès la date du mariage sera le " + this.date + " et son numéro sera le " + contract.number_of_contract);
    }
    public int[] request_date(Scanner sc){
        int correct_date = 0;
        int[] date = new int[3];
        do{
            System.out.print("Veuillez saisir la date de votre mariage sous format (jj/mm/aaaa): ");

            String[] part_of_date = sc.nextLine().split("/");//cette ligne c'est gpt car y'a une fonction split qui existe ou y'a pas du moin que j'ai jamais vu en c
            if (part_of_date.length == 3){
                date[0] = Integer.parseInt(part_of_date[0]);
                date[1] =Integer.parseInt(part_of_date[1]);
                date[2] =Integer.parseInt(part_of_date[2]);
            }

            if(date[0] > 31 || date[0] <= 0 || date[1] > 12 || date[1] <= 0 || date[2] <= 0){
                System.out.println("date saisie incorrect Veuillez ressasir");
            }else{
                correct_date = 1;
            }

        }while(correct_date != 1);
        return date;
    }
    public void marier(Man Man,Woman woman){
        System.out.println("Félicitation " + Man.name + " et " + woman.name + " sont désormais unie pour le restant de leur jour du moin je l'éspèrent");
    }
}
class exo_6_et_exo_7_main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Marriage marriage = new Marriage(sc,"Montpelier");
        Man Man = new Man("Frédéric");
        Woman woman = new Woman("Kanto");
        Contract contract = new Contract(16541522);
        marriage.marier(Man,woman);
        System.out.println(marriage.date);
        marriage.passer(contract);
        sc.close();
    }
}
class Contract{
    int number_of_contract;
    public Contract(int number_of_contract){
        this.number_of_contract = number_of_contract;
    }
}
class Sell{
    public int number_of_sell;
    public int selled_number;
    public Week week;
    public Sell_point sell_point;
    public Review review;
    public Sell(int number_of_sell ,int selled_number ){
        this.number_of_sell = number_of_sell;
        this.selled_number = selled_number;
    }
    public void sells(Week week,Sell_point sell_point,Review review){
        System.out.println("Voici un résumé des vente de la semaine " + week.week_number + " : ");
        System.out.println("Dans la boutique " + sell_point.name_of_shop + " il a été vendu la review " + "'" + review.title + "'" + " au nombre de " + this.selled_number);
    }
}

class Week{
    public int week_number;
    public Week(Scanner sc){
         this.week_number = correct_week(sc);
    }
    public int correct_week(Scanner sc){
        int week;
        int d = 0;
        do {
            System.out.println("Veuillez saisir la semaine de l'année : ");
            week = sc.nextInt();
            if (week > 52 || week <= 0){
                System.out.println("Semaine saisie incorrect");
            }else {
                d++;
            }
        } while (d != 1);
        return week;
    }
}
class Sell_point{
    String name_of_shop;
    public Sell_point(String name_of_shop){
        this.name_of_shop = name_of_shop;
    }
}
class Review{
    String title;
    public Review(String title){
        this.title = title;
    }
}
class main_ex8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sell sell = new Sell(549648,5);
        Review review = new Review("Le chien de Kanto a trop grossi");
        Sell_point sell_point = new Sell_point("L'ECE");
        Week week = new Week(sc);
        sell.sells(week,sell_point,review);
        sc.close();
    }
}
class Configuration{
    public int numero_de_config;
    public Clavier clavier;
    public Ecran ecran;
    public Disque[] disques;
    public Configuration(int numero_de_config){
        this.numero_de_config = numero_de_config;
    }
    public void assembler(Clavier clavier,Ecran ecran,Disque[] disques){
        this.clavier = clavier;
        this.ecran = ecran;
        this.disques = disques;
        System.out.println("Voici votre configuration : \nEcran : " + this.ecran.marque + "\nClavier : " + this.clavier.marque + "\nDisques : ");
        for(int i = 0;i<disques.length;i++){
            System.out.println(disques[i].marque);
        }

    }
    public Disque[] creation_tableau_disque(Disque... disques) {//chad gpt pour les disque sa se nomme varargs
        return disques;
    }

}
class Ecran{
    public String marque;
    public Ecran(String marque){
        this.marque = marque;
    }
}
class Clavier{
    public String marque;
    public Clavier(String marque){
        this.marque = marque;
    }
}
class Disque{
    public String marque;
    public Disque(String marque){
        this.marque = marque;
    }
}
class main_exo_9{
    public static void main(String[] args){
        Configuration configuration = new Configuration(1);
        Clavier clavier = new Clavier("LG");
        Ecran ecran = new Ecran("TuF");
        Disque disque1 = new Disque("HP");
        Disque disque2 = new Disque("Asus");
        configuration.assembler(clavier,ecran,configuration.creation_tableau_disque(disque1,disque2));
    }
}
class Liste{
    public Livre[] livre;
    int max_livre;
    int position;
    public Liste(){
        this.max_livre = 3;
        this.position = -1;
        this.livre = new Livre[max_livre];
    }
    public void premier(){
        if (position >= 0){
            position = 0;
        }else{
            position = -1;
        }
    }
    public void dernier(){
        if (position == -1){
            position = 0;
        }
    }
    public Livre suivant(){
        if (position == -1){
            return null;
        }
        if (position == max_livre) {
            return null;
        }
        else{
            position++;
            return livre[position];
        }
    }
    public Livre supprimer(){
        if (position == -1){
            System.out.println("liste vide rien a supprimer");
            return null;
        }
        else{
            Livre livre1 = livre[position];
            livre[position] = null;
            position--;
            return livre1;
        }

    }
    public void ajouter(Livre livre1) {
        if (position < max_livre - 1) {
            position++;
            livre[position] = livre1;
        } else {
            System.out.println("Dépassement des bord du tableau,impossible d'ajouter");
        }
    }
}
class Pile{
    public Liste liste;
    public Pile(){
        this.liste = new Liste();
    }
    public void empiler(Livre livre){
        //liste.dernier();
        liste.ajouter(livre);
    }
    public Livre depiler(){
       // liste.dernier();
        return liste.supprimer();
    }
}
class Main_exo_10 {
    public static void main(String[] args) {
        Pile pile = new Pile();

        Livre livre1 = new Livre("The Fall");
        Livre livre2 = new Livre("The Plague");
        Livre livre3 = new Livre("The Rebel");
        Livre livre4 = new Livre("The Outsider");

        System.out.println("Tentative de dépiler une pile vide :");
        Livre livreDepile = pile.depiler();
        if (livreDepile == null) System.out.println("Pile vide !\n");

        System.out.println("Empilement des livres :");
        pile.empiler(livre1);
        pile.empiler(livre2);
        pile.empiler(livre3);
        pile.empiler(livre4); // ce dernier devrait afficher une erreur

        System.out.println("\nDépilement des livres :");
        for (int i = 0; i < 4; i++) {
            Livre l = pile.depiler();
            if (l != null)
                System.out.println("Livre dépilé : " + l.titre);
        }

        System.out.println("\nNouvelle tentative de dépiler (pile vide) :");
        pile.depiler();
    }
}
class Vertebre{
     public String os_ou_carthi;
     public Vertebre(String os_ou_carthi){
         this.os_ou_carthi = os_ou_carthi;
     }
}
class Poisson extends Vertebre{
    public String nom;
    public Poisson(String nom,String os_ou_carthi){
        super(os_ou_carthi);
        this.nom = nom ;
    }
}
class Oiseau extends Vertebre{
    public String nom;
    public Oiseau(String nom,String os_ou_carthi){
        super(os_ou_carthi);
        this.nom = nom;
    }
}
class Main_exo_12{
    public static void main(String [] args){
        Vertebre vertebre = new Vertebre("Os");
        Oiseau oiseau = new Oiseau("Piaf","carthi");
        Poisson poisson = new Poisson("Nemo","Os");
        System.out.println(vertebre.os_ou_carthi + oiseau.nom + oiseau.os_ou_carthi + poisson.os_ou_carthi + poisson.nom);
    }
}
class Mammifere extends Vertebre{
    public boolean poil;
    public Mammifere(String os_ou_carthi){
        super(os_ou_carthi);
        this.poil = true;
    }
    public void affiche_mammifere(){
        System.out.println(this.poil + " " + this.os_ou_carthi);
    }
}
class Maman{
    private int age;
    public Maman(int age){
        this.age = age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
class Fifille extends Maman{
    private int note;
    public Fifille(int age,int note){
        super(age);
        this.note = note;
    }

    public void modifier_age(int nouveau_age) {
         setAge(nouveau_age);
    }

    public void afficher_fifille(){
        System.out.println("Age : " + getAge() + " note : " + this.note);
    }
}
class Main_exo_14{
    public static void main(String[] args){
    Fifille fifille = new Fifille(20,20);
    System.out.println(fifille.getAge());
    fifille.modifier_age(21);
    fifille.afficher_fifille();
    }
}
class Personne{
    private Personne conjoint;

    public void pacser(Personne autre){
        this.conjoint = autre;
        autre.conjoint = this;
    }
    public Personne getConjoint(){
        return conjoint;
    }
}

class Homme extends Personne{
    private int age;
    public Homme(int age){
        this.age = age;
    }
}
class Femme extends Personne{
    private int age;
    public Femme(int age){
        this.age = age;
    }
}
class Test {
    public static void main(String[] args) {
        Homme h = new Homme(25);
        Femme f = new Femme(22);

        h.pacser(f);

        System.out.println(h.getConjoint()); 
        System.out.println(f.getConjoint());
    }
}