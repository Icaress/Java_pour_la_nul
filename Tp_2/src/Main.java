import java.util.Scanner;

class Hebergement{
    private int unique_id;
    private String name;
    private int adresse_postal;
    private int nombre_max_Per;
    private int price_per_night;
    private String description;
    public String toString(){
        return "ID hebergement : " + this.unique_id + "\nNom de l'hebergement : " + this.name + "\nAdresse Postal de l'hebergement : " + this.adresse_postal
                + "\nNombre max de personne de l'hebergement : " + this.nombre_max_Per + "\nPrix par nuit : " + this.price_per_night + "\nDescription : " +
                this.description;
    }
    public void saisie_ID(Scanner sc) {
        int Id_Temp = -1;
        while (true){
            System.out.println("Veuillez saisir votre ID : ");
            if (sc.hasNextInt()){
                Id_Temp = sc.nextInt();
                sc.nextLine();
                if(Id_Temp > 0){
                    this.unique_id = Id_Temp;
                    System.out.println("identifiant unique crée avec succès " + this.unique_id);
                    break;
                }else{
                    System.out.println("Problème de saisie : L'entier saisie doit être positif");
                }
            }else{
                System.out.println("Problème de saisie : La saisie ne peu pas être vide ");
            }
        }
    }
    public void saisie_nom(Scanner sc){
        while (true){
            System.out.println("Veuillez saisir votre nom d'hébergement : ");
            if (sc.hasNext()){
                this.name = sc.nextLine();
                break;
            }else{
                System.out.println("Problème de saisie : Le nom ne peu pas être vide");
            }
        }
    }
    public void saisie_adresse_postal(Scanner sc){
        int postale_temp = -1;
        while (true){
            System.out.println("Veuillez saisir votre adresse postale : ");
            if (sc.hasNextInt()){
                postale_temp = sc.nextInt();
                sc.nextLine();
                if (postale_temp>0){
                    this.adresse_postal = postale_temp;
                    System.out.println("Adresse postale crée avec succès : " + this.adresse_postal);
                    break;
                }else{
                    System.out.println("Problème de saisie : L'adreesse postale ne peut pas être négatif");
                }
            }else{
                System.out.println("Problème de saisie : l'adresse postale ne peu pas être vide");
            }
        }
    }
    public void saisie_nb_max(Scanner sc){
        int nb_max_temp = -1;
        while(true){
            System.out.println("Veuillez saisir le nombre de personne maximum de personne que l'hébergement peut accueillir : ");
            if (sc.hasNext()){
                nb_max_temp = sc.nextInt();
                sc.nextLine();
                if (nb_max_temp>0){
                    this.nombre_max_Per = nb_max_temp;
                    System.out.println("Nombre maximum de personne crée avec succès : " + this.nombre_max_Per + " personne maximum autorisé");
                    break;
                }else{
                    System.out.println("Problème de saisie : Nombre de personne ne peut pas être négatif ");
                }
            }else {
                System.out.println("Problème de saisie : nombre de personne maximum ne peut pas être vide");
            }
        }
    }
    public void saisie_prix_par_nuit(Scanner sc){
        int prix_nuit_temp = -1 ;
        while (true){
            System.out.println("Veuillez saisir le prix de la nuit a cette hébergement : ");
            if (sc.hasNextInt()){
                prix_nuit_temp = sc.nextInt();
                sc.nextLine();
                if (prix_nuit_temp >= 0){
                    this.price_per_night = prix_nuit_temp;
                    System.out.println("Création du prix avec succès : " + this.price_per_night + "€ par nuit");
                    break;
                }else {
                    System.out.println("Problème de saisie : la nuit ne peu pas être négatif");
                }
            }else {
                System.out.println("Problème de saisie : la nuit doit avoir un prix , si gratuit prix_par_nuit = 0");
            }
        }
    }
    public void ajouter_description(Scanner sc){
        System.out.println("Veuillez saisir une description a propos de votre hébergement");
        this.description = sc.nextLine();
    }
}