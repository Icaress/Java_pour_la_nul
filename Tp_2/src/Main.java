import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

class Hebergement {
    private int unique_id;
    private String name;
    private int adresse_postal;
    private int nombre_max_Per;
    private int price_per_night;
    private String description;
    private String type_hebergement;
    private int note;


    public Hebergement(Scanner sc) {
        this.unique_id = saisie_ID(sc);
        this.name = saisie_nom(sc);
        this.adresse_postal = saisie_adresse_postal(sc);
        this.nombre_max_Per = saisie_nb_max(sc);
        this.price_per_night = saisie_prix_par_nuit(sc);
        this.description = ajouter_description(sc);
        this.type_hebergement = saisie_type_hebergement(sc);
        this.note = saisie_note(sc);

    }
    public int saisie_note(Scanner sc){
        int note_temp = 0;
        System.out.println("Veuillez saisir une note a cette hebergement (entre 0 et 5 étoile) : ");
        while (true){
            if (sc.hasNextInt()){
                note_temp = sc.nextInt();
                if (note_temp > 0 && note_temp < 5){
                    this.note = note_temp;
                    return this.note;
                }else {
                    System.out.println("Problème de saisie : note incorrecte");
                }
            }else {
                System.out.println("Problème de saisie : la note ne peu pas être vide");
            }
        }
    }
    public int getNote(){
        return note;
    }
    public int getPrice_per_night(){
        return price_per_night;
    }
    public String getType_hebergement(){
        return getType_hebergement();
    }
    public String getName(){
        return getName();
    }
    public void moyenne(Scanner sc,Hebergement ... hebergement){
        double somme = 0 ;
        for(Hebergement h : hebergement){
            somme += h.getNote();
        }
        double moyenne = somme/hebergement.length;
        System.out.println("La moyenne de cette établissement est : " + moyenne);
    }

    public String toString() {
        return "ID hebergement : " + this.unique_id + "\nNom de l'hebergement : " + this.name + "\nAdresse Postal de l'hebergement : " + this.adresse_postal
                + "\nNombre max de personne de l'hebergement : " + this.nombre_max_Per + "\nLe type d'hebergement : "+ this.type_hebergement + "\nPrix par nuit : " + this.price_per_night + "\nDescription : " +
                this.description;
    }
    public String saisie_type_hebergement(Scanner sc){
        String type_temp = "";
        System.out.println("Veuillez saisir votre type d'hebergement entre villa,hotel ou appartement (écrit exactement comme précédement)");
        while (true) {
            if (sc.hasNextLine()) {
                type_temp = sc.nextLine();
                if (type_temp.equals("villa") || type_temp.equals("hotel") || type_temp.equals("appartement")) {
                    System.out.println("Type d'hebergement initialise avec succès à la catégorie : " + type_temp);
                    this.type_hebergement = type_temp;
                    return this.type_hebergement;
                } else {
                    System.out.println("Problème de saisie : La saisie doit être soit hotel soit villa soit appartement");
                }
            } else {
                System.out.println("Problème de saisie : La saisie ne peu pas être vide");
            }
        }
    }


    public int saisie_ID(Scanner sc) {
        int Id_Temp = -1;
        while (true) {
            System.out.println("Veuillez saisir votre ID : ");
            if (sc.hasNextInt()) {
                Id_Temp = sc.nextInt();
                sc.nextLine();
                if (Id_Temp > 0) {
                    this.unique_id = Id_Temp;
                    System.out.println("identifiant unique crée avec succès " + this.unique_id);
                    return this.unique_id;
                } else {
                    System.out.println("Problème de saisie : L'entier saisie doit être positif");
                }
            } else {
                System.out.println("Problème de saisie : La saisie ne peu pas être vide ");
            }
        }
    }

    public String saisie_nom(Scanner sc) {
        while (true) {
            System.out.println("Veuillez saisir votre nom d'hébergement : ");
            if (sc.hasNext()) {
                this.name = sc.nextLine();
                return this.name;
            } else {
                System.out.println("Problème de saisie : Le nom ne peu pas être vide");
            }
        }
    }

    public int saisie_adresse_postal(Scanner sc) {
        int postale_temp = -1;
        while (true) {
            System.out.println("Veuillez saisir votre adresse postale : ");
            if (sc.hasNextInt()) {
                postale_temp = sc.nextInt();
                sc.nextLine();
                if (postale_temp > 0) {
                    this.adresse_postal = postale_temp;
                    System.out.println("Adresse postale crée avec succès : " + this.adresse_postal);
                    return this.adresse_postal;
                } else {
                    System.out.println("Problème de saisie : L'adreesse postale ne peut pas être négatif");
                    sc.nextLine();
                }
            } else {
                System.out.println("Problème de saisie : l'adresse postale ne peu pas être vide");
                sc.nextLine();
            }
        }
    }

    public int saisie_nb_max(Scanner sc) {
        int nb_max_temp = -1;
        while (true) {
            System.out.println("Veuillez saisir le nombre de personne maximum de personne que l'hébergement peut accueillir : ");
            if (sc.hasNextInt()) {
                nb_max_temp = sc.nextInt();
                sc.nextLine();
                if (nb_max_temp > 0) {
                    this.nombre_max_Per = nb_max_temp;
                    System.out.println("Nombre maximum de personne crée avec succès : " + this.nombre_max_Per + " personne maximum autorisé");
                    return this.nombre_max_Per;
                } else {
                    System.out.println("Problème de saisie : Nombre de personne ne peut pas être négatif ");
                }
            } else {
                System.out.println("Problème de saisie : nombre de personne maximum ne peut pas être vide");
            }
        }
    }

    public int saisie_prix_par_nuit(Scanner sc) {
        int prix_nuit_temp = -1;
        while (true) {
            System.out.println("Veuillez saisir le prix de la nuit a cette hébergement : ");
            if (sc.hasNextInt()) {
                prix_nuit_temp = sc.nextInt();
                sc.nextLine();
                if (prix_nuit_temp >= 0) {
                    this.price_per_night = prix_nuit_temp;
                    System.out.println("Création du prix avec succès : " + this.price_per_night + "€ par nuit");
                    return this.price_per_night;
                } else {
                    System.out.println("Problème de saisie : la nuit ne peu pas être négatif");
                }
            } else {
                System.out.println("Problème de saisie : la nuit doit avoir un prix , si gratuit prix_par_nuit = 0");
            }
        }
    }

    public String ajouter_description(Scanner sc) {
        System.out.println("Veuillez saisir une description a propos de votre hébergement");
        this.description = sc.nextLine();
        return this.description;
    }
    public int[] saisie_date_sortie(Scanner sc) {
        int correct_date = 0;
        int[] date = new int[3];
        do {
            System.out.println("Veuillez saisir la date de fin sous format (jj/mm/aaaa): ");

            String[] part_of_date = sc.nextLine().split("/");

            if (part_of_date.length == 3) {
                date[0] = Integer.parseInt(part_of_date[0]);
                date[1] = Integer.parseInt(part_of_date[1]);
                date[2] = Integer.parseInt(part_of_date[2]);
            }
            if (date[0] > 31 || date[0] <= 0 || date[1] > 12 || date[1] <= 0 || date[2] <= 0) {
                System.out.println("Problème de saisie : saisie de la date est incorrect ");
            } else {
                correct_date = 1;
            }
        } while (correct_date != 1);
        return date;
    }

    public int[] saisie_date_entre(Scanner sc) {
        int correct_date = 0;
        int[] date = new int[3];
        do {
            System.out.println("Veuillez saisir la date de début sous format (jj/mm/aaaa): ");

            String[] part_of_date = sc.nextLine().split("/");

            if (part_of_date.length == 3) {
                date[0] = Integer.parseInt(part_of_date[0]);
                date[1] = Integer.parseInt(part_of_date[1]);
                date[2] = Integer.parseInt(part_of_date[2]);
            }
            if (date[0] > 31 || date[0] <= 0 || date[1] > 12 || date[1] <= 0 || date[2] <= 0) {
                System.out.println("Problème de saisie : saisie de la date est incorrect ");
            } else {
                correct_date = 1;
            }
        } while (correct_date != 1);
        return date;
    }
    public void date_possible_entrer_sortie_herbergement(ArrayList<Integer[][]> tableau_date_reservation,int[] date_entre,int[] date_sortie){
        Integer[][] reservation = new Integer[2][];
        reservation[0] = new Integer[date_entre.length];
        reservation[1] = new Integer[date_sortie.length];

        for (int i = 0 ; i < date_entre.length ; i++){
            reservation[0][i] = date_entre[i];
            reservation[1][i] = date_sortie[i];
        }

        if (tableau_date_reservation.isEmpty()){
            tableau_date_reservation.add(reservation);
        }else{
            boolean Deja_pris = false;
            for (Integer[][] res : tableau_date_reservation){
                if (Arrays.equals(res[0],reservation[0]) && Arrays.equals(res[1],reservation[1])){
                    Deja_pris = true;
                    break;
                }
            }
            if (Deja_pris){
                System.out.println("Nous somme désolé mais nous avions déjà une réservation a cette periode");
            }else {
                tableau_date_reservation.add(reservation);
            }
        }
    }
    public int compte_j(int[] date_entre,int[] date_sortie){
        int j_compter = 0;
        if (date_entre == null || date_sortie == null){
            System.out.println("Problème de saisie : les valeurs de saisie ne peuvent pas être vide ");
            return 0;
        }
        int[] tableau_entrer = Arrays.copyOf(date_entre,3);
        int[] tableau_sortie = Arrays.copyOf(date_sortie,3);


        while (!Arrays.equals(tableau_entrer,tableau_sortie)){
            if (tableau_entrer[0] == 31 && tableau_entrer[1] == 12){
                j_compter++;
                tableau_entrer[0] = 1;
                tableau_entrer[1] = 1;
                tableau_entrer[2]++;
            }else if (tableau_entrer[0] == 31) {
                j_compter++;
                tableau_entrer[1]++;
                tableau_entrer[0] = 1;
            }else {
                j_compter++;
                tableau_entrer[0]++;
            }
        }
        return j_compter;
    }
    public void prix_sejour(int j_compter){
        System.out.println("le prix du séjour est de " + j_compter*this.price_per_night + "€");
    }
}
class Main_exo1_TP_2{
    //j'ai trop la flemme de faire date sortie sa me prend trop de temp
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer[][]> tableau_des_dates_occupe = new ArrayList<>();
        Hebergement hebergement = new Hebergement(sc);
        Hebergement hebergement1 = new Hebergement(sc);
        hebergement.date_possible_entrer_sortie_herbergement(tableau_des_dates_occupe, hebergement.saisie_date_entre(sc) ,hebergement.saisie_date_sortie(sc) );
        hebergement1.date_possible_entrer_sortie_herbergement(tableau_des_dates_occupe ,hebergement1.saisie_date_entre(sc),hebergement1.saisie_date_sortie(sc));
        //hebergement.prix_sejour(hebergement.compte_j(hebergement.saisie_date_entre(sc),hebergement.saisie_date_sortie(sc)));
        //un petit abstract il n'y a pas de constion afin de vérifier si les date entre et sortie son cohérente
        System.out.println(hebergement);
        hebergement.moyenne(sc,hebergement,hebergement1);
    }
}

class Client{
    private String nom;
    private String prenom;
    private String mdp;
    private String email;
    private String adresse;
    private int[] date_inscrpiton;

    public Client(Scanner sc){
        this.nom = saisie_nom(sc);
        this.prenom = saisie_prenom(sc);
        this.mdp = saisie_mdp(sc);
        this.adresse = saisie_adresse(sc);
        this.email = saisie_email(sc);
        this.date_inscrpiton = saisie_date_inscription(sc);
    }
    public String getMdp(){
        return getMdp();
    }
    public String getEmail(){
        return getEmail();
    }
    public String saisie_nom(Scanner sc){
        while(true){
            System.out.println("Veuillez saisir votre nom");
            if (sc.hasNextLine()){
                this.nom = sc.nextLine();
                return this.nom;
            } else {
                System.out.println("Problème de saisie : le nom ne peu pas être vide");
            }
        }
    }
    public String saisie_prenom(Scanner sc){
        while(true){
            System.out.println("Veuillez saisir votre prenom");
            if (sc.hasNextLine()){
                this.prenom = sc.nextLine();
                return this.prenom;
            } else {
                System.out.println("Problème de saisie : le prenom ne peu pas être vide");
            }
        }
    }
    public String saisie_mdp(Scanner sc){
        while(true){
            System.out.println("Veuillez saisir votre mdp");
            if (sc.hasNextLine()){
                this.mdp = sc.nextLine();
                return this.mdp;
            } else {
                System.out.println("Problème de saisie : le mdp ne peu pas être vide");
            }
        }
    }
    public String saisie_email(Scanner sc){
        while(true){
            System.out.println("Veuillez saisir votre email");
            if (sc.hasNextLine()){
                this.email = sc.nextLine();
                return this.email;
            } else {
                System.out.println("Problème de saisie : l'email ne peu pas être vide");
            }
        }
    }
    public String saisie_adresse(Scanner sc){
        while(true){
            System.out.println("Veuillez saisir votre adresse");
            if (sc.hasNextLine()){
                this.adresse = sc.nextLine();
                return this.adresse;
            } else {
                System.out.println("Problème de saisie : l'adresse ne peu pas être vide");
            }
        }
    }
    public int[] saisie_date_inscription(Scanner sc) {
        int correct_date = 0;
        int[] date = new int[3];
        do {
            System.out.println("Veuillez saisir la date de l'inscription sous format (jj/mm/aaaa): ");

            String[] part_of_date = sc.nextLine().split("/");

            if (part_of_date.length == 3) {
                date[0] = Integer.parseInt(part_of_date[0]);
                date[1] = Integer.parseInt(part_of_date[1]);
                date[2] = Integer.parseInt(part_of_date[2]);
            }
            if (date[0] > 31 || date[0] <= 0 || date[1] > 12 || date[1] <= 0 || date[2] <= 0) {
                System.out.println("Problème de saisie : saisie de la date est incorrect ");
            } else {
                correct_date = 1;
            }
        } while (correct_date != 1);
        date = this.date_inscrpiton;
        return this.date_inscrpiton;
    }
    public void filtre_type_hebergement(String type_hebergement, Hebergement... hebergements) {
        ArrayList<Hebergement> tableau_hebergement = new ArrayList<>();

        for (Hebergement h : hebergements) {
            if (h.getType_hebergement().equals(type_hebergement)) {
                tableau_hebergement.add(h);
            }
        }

        for (Hebergement h : tableau_hebergement) {
            System.out.println(h);
        }
    }
}
class Nouveau_Client extends Client{
    public Nouveau_Client(Scanner sc){
        super(sc);
    }
    public Client inscription(Scanner sc){
        Client client = new Client(sc);
        System.out.println("Le compte a été crée avec succès voici le mdp du compte : " + client.getMdp() + " et le mail utiliser est : " + client.getEmail() );
        return client;
    }
}
class AncienClient extends Client{
    public AncienClient(Scanner sc){
        super(sc);
    }
    public void connection(Scanner sc,Client client){
        String email_temp = "";
        String mdp_temp = "";
        while (true){
            System.out.println("Veuillez saisir votre email");
            if (sc.hasNextLine()){
                email_temp = sc.nextLine();
                if (email_temp.equals(client.getEmail())){
                    System.out.println("Email trouvé !");
                    System.out.println("Veuillez saisir votre mdp : ");
                        if (sc.hasNextLine()){
                            mdp_temp = sc.nextLine();
                            if (mdp_temp.equals(client.getMdp())){
                                System.out.println("connecter avec succès , voici vos information personnel : " + client);
                                break;
                            }else{
                                System.out.println("Problème de connection,veuillez ressayer");
                            }
                        }else {
                            System.out.println("Problème de connection,veuillez ressayer");
                        }
                }else {
                    System.out.println("Problème de connection,veuillez ressayer");
                }
            }else{
                System.out.println("Problème de connection,veuillez ressayer");
            }
        }
    }
}

class Reservation{
    private Client client;
    private Hebergement hebergement;

    public Reservation (Client client,Hebergement hebergement){
        this.client = client;
        this.hebergement = hebergement;
    }

}