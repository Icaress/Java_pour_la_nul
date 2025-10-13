import java.lang.annotation.Target;
import java.util.Scanner;

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
        int[] TabInt = new int[5];
        int[] TabInt2 = new int[5];
        String[] tabString = new String[5];
        //c'est une version plus simple que la suivante sa permet de faire le for en entier
        for (int j : TabInt) {
            System.out.println(j);
        }
        String[] tabString2 = new String[4];
        for (int i = 0;i < tabString2.length;i++){
            System.out.println(tabString2[i]);
        }
        char[] tabchar = new char[5];
        int size = tabchar.length;
    }
}
class ex_8_ex_9{
    public static void main(String[] args){
        int[] tabint = {4,56,66,45,25};//ex_9
        String[] tab = {"als","dsf","scsx","asd"};
        for(int i : tabint){
            System.out.println(i);
        }
        for(String j : tab){
            System.out.println(j);
        }

    }
}
class ex_10 {
    public static void main(String[] args) {
        int[][] tabint = {{152, 251, 5554, 12}
                , {155, 155, 2485, 115}};
        int[][] tabint2 = new int[2][];
        tabint2[0] = new int[3];
        tabint2[1] = new int[5];
        tabint2[0][0] = 20;
        tabint2[1][4] = 20;
        for (int i = 0; i < tabint2.length; i++) {
            for (int j = 0; j < tabint2[i].length; j++) {
                System.out.println(tabint2[i][j]);
            }
        }
        // sa c'est vraiment complexe c'est une boucle for each c'est simple genre c'est juste que tabint2 c'est les valeur de i de la première dimension
        // et ints c'est la valeur des y c'est juste les deux facons de l'écrire je te conseille le prmier pour pour pas tomber dans la trappe
        for (int[] ints : tabint2) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
    }
}

class exo_11{
    public static void main(String[] args){
        int[] tab_int = {1,2,3,4,6,6,8,7,6,9};
        //1ère école
        int[] tab_int1 = tab_int;
        //2ème école
        int[] tab_int2 = new int[tab_int.length];
        for(int i = 0; i < tab_int2.length; i++){
            tab_int2[i] = tab_int[i];
            System.out.print(tab_int2[i]);
            System.out.print(tab_int[i]);
        }
        tab_int[0] = 9;
        for(int i = 0; i < tab_int2.length; i++) {
            System.out.print(tab_int2[i]);
            System.out.print(tab_int[i]);
        }
    }
}

class exo_12{
    public static void main(String[] args){
        String init_str = "String";
        String nv_str = init_str;
        String rien = "";
    }
}

class exo_13{
    public static void main(String[] args){
        String str_1 = "";
        String str_2 = "";
        String str_3 = str_1 + str_2;
    }
}

class exo_14{
    public static void main(String[] args){
        String entier_str = "123";
        int conversion = Integer.parseInt(entier_str);
        System.out.println(entier_str + " " + conversion);
        int entier = 123;
        String ch = String.valueOf(entier);
        System.out.print(entier + " " + ch);
    }
}