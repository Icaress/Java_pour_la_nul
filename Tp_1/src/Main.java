import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Etudiant etudiant_1 = new Etudiant();
        etudiant_1.creation_etudiant(sc);
        etudiant_1.saisie_de_note(sc);
        etudiant_1.affichage_information_etudiant(etudiant_1);
        etudiant_1.calcul_de_moyenne();
        sc.close();
    }
}

class Etudiant{
    private String nom = "";
    private int age = 0;
    private int nombre_de_notes = 0;
    private double[] notes = new double[nombre_de_notes];
    public Etudiant(){
        this.nom = "";
        this.age = 0;
        this.nombre_de_notes = 0;
        this.notes = new double[nombre_de_notes];
    }
    public void creation_etudiant(Scanner sc){
        //vraimment sa c'est du blindage je voulais juste savoir comment sa marche en java mais c'est vachement galère on apprendra sa plus tard c'est le seul que je vais blindé j'ai trop la flemme
        while(true){
            System.out.println("Veuillez saisir votre nom : ");
            nom = sc.nextLine();

            if (nom.matches("[a-zA_Z]+")) { //chad gpt cette partie la c'est un peu compliqué sa s'écrit pas comme sur Clion c'est relou c'est juste que il vérifie si c'est dans les lettre du tableau en pattern et le "[a-zA_Z]+" c'est le pattern sa s'écrit comme sa et le match c'est une méthode de la classe String
                break;
            }else{
                System.out.println("Nom invalide! veuillez ressaisir");
            }
        }
        System.out.println("Veuillez saisir votre age : ");
        age = sc.nextInt();
        sc.nextLine();
        if (age < 18 || age > 25){
            do {
                System.out.println("Age incorrect !! Veuillez saisir un age correct : ");
                age = sc.nextInt();
            }while(age < 18 || age > 25);
        }
        System.out.println("Veuillez saisir votre nombre de notes : ");
        nombre_de_notes = sc.nextInt();
        sc.nextLine();
        if (nombre_de_notes < 2 || nombre_de_notes > 5){
            do{
                System.out.println("Nombre de notes incorrect !! Veuillez ressaisir : ");
                nombre_de_notes = sc.nextInt();
            }while(nombre_de_notes < 2 || nombre_de_notes > 5);
        };
    }
    public void calcul_de_moyenne(){
        double resultat = 0;
        if (notes.length == 0){
            System.out.print("Error the table is empty");
            return;
        }
        for(int i = 0; i < notes.length; i++){
            resultat += notes[i];
        }
        resultat /= notes.length;
        System.out.println("Voici votre moyenne : " + resultat);
    }
    public void saisie_de_note(Scanner sc){
        notes = new double[nombre_de_notes];
        System.out.println("Veuillez saisir vos notes :");
        for(int i = 0; i < notes.length ; i++){
            notes[i] = sc.nextDouble();
            if (notes[i] < 0.0 || notes[i] > 20.0){
                do{
                    System.out.println( i + 1 + " ème notes saisie incorrect !! Veuillez ressaisir : ");
                    notes[i] = sc.nextDouble();
                }while(notes[i] < 0.0 || notes[i] > 20.0);
            }
        };
    }
    public void affichage_information_etudiant(Etudiant etudiant){
        System.out.println("-- Informations de l'étudiant --");
        System.out.println("Nom : " + this.nom);
        System.out.println("Age : " + this.age);
        for (int i = 0 ; i < notes.length ; i++)
            System.out.println("Notes" + i + " : " + this.notes[i]);
    }
}