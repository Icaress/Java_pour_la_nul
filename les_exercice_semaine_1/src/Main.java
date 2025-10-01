import java.lang.annotation.Target;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Train t = new Train();
        System.out.println("vitesse du train t : "+ t.vitesse + " statue du train : " + t.en_marche);
        t.stopper();
        System.out.println("vitesse du train t : "+ t.vitesse + " statue du train : " + t.en_marche);
        t.accelere();
        t.accelere();
        t.accelere();
        System.out.println("vitesse du train t : "+ t.vitesse + " statue du train : " + t.en_marche);
        t.ralentir();
        System.out.println("vitesse du train t : "+ t.vitesse + " statue du train : " + t.en_marche);
        t.ralentir();
        t.ralentir();
        System.out.println("vitesse du train t : "+ t.vitesse + " statue du train : " + t.en_marche);

        deux_Methode m = new deux_Methode();
        String mot_1 = "je ";
        String mot_2 = "suis fatigué";
        System.out.println(m.concatenation(mot_1,mot_2));


        m.nouvelle_methode(t,mot_1);
    }
}

class Train {

    int vitesse = 0;
    boolean en_marche = false;

    public Train(){
        this.vitesse = 150;
        this.en_marche = true;
    }
    public void stopper(){
        this.vitesse = 0;
        this.en_marche = false;
    }
    public void ralentir(){
        if (this.vitesse != 0){
            this.vitesse -= 50;
            if(this.vitesse <= 0){
                this.vitesse = 0;
                this.en_marche = false;
            }
        }
    }
    public void accelere(){
        if (this.vitesse <= 350) {
            this.en_marche = true;
            this.vitesse += 50;
            if (this.vitesse > 350) {
                this.vitesse = 350;
            }
        }
    }
}

class deux_Methode{
    public String concatenation(String mot_un,String mot_deux){
        return mot_un + mot_deux;
    }
    public void nouvelle_methode(Train t1,String mot){
        System.out.println("nouvelle méthode appelée");
        System.out.println(t1.vitesse + mot);
    }
}

class main_2{
    public static void main(String [] args){
        String nom = args[0];
        int age = Integer.parseInt(args[1]);

        System.out.println("le nom : " + nom);
        System.out.println("l'age : " + age);

    }
}

class ex_4{
    public static int valeur = 1;
    public int valeur_1 = 2;
    public final String str_1 = "je";
    public static void incrementervaleur(){
        valeur++;
    }
    public static void main(String[] args){
        System.out.println(valeur);
        //System.out.println(valeur_1);
        //cette ligne marche pas car c'est pas un static donc c'est une variable d'un objet et non de la classe
        //donc pour la faire marché il faut crée un objet de cette classe
        ex_4 affiche_none_static = new ex_4();
        System.out.println(affiche_none_static.valeur_1);
        ex_4.incrementervaleur();
        System.out.println(ex_4.valeur);
        System.out.println(affiche_none_static.str_1);
        //pas modifiable car c'est un final donc une valeur non modifiable d'après le cours
    }
}

class Conducteur{
    public static void main(String[] args){
        Train t = new Train();
        t.stopper();
        System.out.println("vitesse du train : " + t.vitesse + " en_marche : " + t.en_marche);
        t.accelere();
        System.out.println("vitesse du train : " + t.vitesse + " en_marche : " + t.en_marche);
    }
}

class ex_6{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("quelle est votre nom ?");
        String nom = sc.nextLine();
        System.out.println("Bienvenue : " + nom);
        int entier = sc.nextInt();
        System.out.println("entier saisie: " + entier);

        sc.close();
        System.out.println("ressource libérer");
    }
}

class ex_7{
    public static void main(String [] args){
        
    }
}