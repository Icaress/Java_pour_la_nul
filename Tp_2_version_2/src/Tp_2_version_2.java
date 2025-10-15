import java.util.Scanner;
import java.util.ArrayList;

public class Tp_2_version_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Accommodation accommodation = new Accommodation(sc,Accommodation.accommodation_type());

    }
}

class Accommodation{
    private int unique_ID;
    private String name;
    private int postal_address;
    private String postal_address_name;
    private String type_of_accommodation;
    private int number_max_people;
    private int price_per_night;
    private String description;
    private ArrayList<String> description_of_material;

    public Accommodation(Scanner sc,ArrayList<String> type_of_accommodation){
        this.setUnique_ID(enter_Unique_ID(sc));
        this.setName(enter_name(sc));
        this.setPostal_address(enter_postal_address(sc));
        this.setPostal_address_name(enter_postal_address_name(sc));
        this.setType_of_accommodation(enter_type_of_accommodation(sc,type_of_accommodation));
        this.setNumber_max_people(enter_number_max_people(sc));
        this.setPrice_per_night(enter_price_per_night(sc));
        this.setDescription(enter_description(sc));
        this.setDescription_of_material(enter_description_of_material(sc));
    }
    public String toString(){
        String materials = String.join(", ", getDescription_of_material());

        return "This is a little presentation about your accommodation : \nYour Unique ID : " + getUnique_ID() +
                "\nYour accommodation name : " + getName() + "\nYour Postal address : " + getPostal_address() +"\nYour postal address name : " +
                getPostal_address_name() + "Your type of accommodation : " + getType_of_accommodation() + "Your accommodation max people number : " +
                getNumber_max_people() + "Your accommodation price per night : " + getPrice_per_night() + "Your accommodation description : " + getDescription() +
                "and your accommodation material description : " + materials ;
    }
    public int getUnique_ID(){
        return this.unique_ID;
    }
    public void setUnique_ID(int unique_ID){
        this.unique_ID = unique_ID;
    }
    public static int enter_Unique_ID(Scanner sc){
        while (true){
            System.out.println("Please enter your Unique ID");
            if (sc.hasNextInt()) {
                int ID = sc.nextInt();
                sc.nextLine();
                    if (ID > 0) {
                        System.out.println("ID created successfully !");
                        return ID;
                    }else {
                        System.out.println("Warning : unique ID cannot be less than 1");
                    }
            }else {
                System.out.println("Warning : unique ID cannot be empty");
            }
        }
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public static String enter_name(Scanner sc){
        while (true){
            System.out.println("Please enter your accommodation name");
            if (sc.hasNextLine()){
                System.out.println("accommodation name created successfully");
                return sc.nextLine();
            }else {
            System.out.println("Warning : your accommodation need name");
            }
        }
    }
    public int getPostal_address(){
        return this.postal_address;
    }
    public void setPostal_address(int postal_address){
        this.postal_address = postal_address;
    }
    public static int enter_postal_address(Scanner sc){
        while (true){
            System.out.println("Please enter your postal address");
            if (sc.hasNextInt()){
                int postal_address = sc.nextInt();
                if (postal_address > 0){
                    System.out.println("postal address created successfully");
                    return postal_address;
                }else {
                    System.out.println("Warning : postal address cannot be less than 0");
                }
            }else {
                System.out.println("Warning : postal address cannot be empty");
            }
        }
    }

    public String getPostal_address_name() {
        return postal_address_name;
    }
    public void setPostal_address_name(String name){
        this.postal_address_name = name;
    }
    public static String enter_postal_address_name(Scanner sc){
        while (true){
            System.out.println("Please enter your postal address name");
            if (sc.hasNextLine()){
                String name = sc.nextLine();
                System.out.println("postal_address name was created successfully");
                return name;
            }else {
                System.out.println("Warning : postal address name cannot be empty");
            }
        }
    }
    public String getType_of_accommodation(){
        return this.type_of_accommodation;
    }
    public void setType_of_accommodation(String typeOfAccommodation){
        this.type_of_accommodation = typeOfAccommodation;
    }
    public static ArrayList<String> accommodation_type(){
        ArrayList<String> accommodation = new ArrayList<>();
        accommodation.add("hotels");
        accommodation.add("resort");
        accommodation.add("motels");
        accommodation.add("hostels");
        accommodation.add("bed and breakfast");
        accommodation.add("Guest houses");
        accommodation.add("holiday homes");
        accommodation.add("apartments");
        accommodation.add("cabins");
        accommodation.add("chalets");
        accommodation.add("Botels");
        return accommodation;
    }
    public static String enter_type_of_accommodation(Scanner sc,ArrayList<String> type_of_accommodation){
        while (true) {
            System.out.println("Please enter your type of accommodation between the list if you don't know all type ,please enter print");
            if (sc.hasNextLine()) {
                String type_of = sc.nextLine();
                if (type_of.equals("print")) {
                    for (String s : type_of_accommodation) {
                        System.out.println(s);
                    }
                } else {
                    for (String s : type_of_accommodation) {
                        if (s.equalsIgnoreCase(type_of)) {
                            System.out.println("Type given successfully");
                            return type_of;
                        }
                    }
                    System.out.println("Warning : Given arguments is wrong and never equals to a type");
                }
            }else {
                System.out.println("Warning : type cannot be empty");
            }
        }
    }
    public int getNumber_max_people(){
        return this.number_max_people;
    }
    public void setNumber_max_people(int nb_people){
        this.number_max_people = nb_people;
    }
    public int enter_number_max_people(Scanner sc){
        while (true){
            System.out.println("Please enter the maximum number of ur accommodation");
            if (sc.hasNextInt()) {
                int number_max = sc.nextInt();
                if (number_max > 0){
                    System.out.println("Number of maximum people given successfully");
                    return number_max;
                }else {
                    System.out.println("Warning : number maximum of people cannot be less than 1");
                }
            }else {
                System.out.println("Warning : number maximum of people cannot be empty");
            }
        }
    }
    public int getPrice_per_night(){
        return this.price_per_night;
    }
    public void setPrice_per_night(int pricePerNight){
        this.price_per_night = pricePerNight;
    }
    public static int enter_price_per_night(Scanner sc){
        while (true){
            System.out.print("Please enter the price of accommodation per night");
            if (sc.hasNextInt()){
                int price_night = sc.nextInt();
                if (price_night == 0){
                    System.out.print("Your accommodation its free");
                    return price_night;
                }else if (price_night >= 0){
                    System.out.print("Your accommodation price given successfully");
                    return price_night;
                }else {
                    System.out.println("Warning : price cannot be less than 0");
                }
            }else {
                System.out.println("Warning : the price per night cannot be empty");
            }
        }
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public static String enter_description(Scanner sc){
        while (true){
            System.out.println("Please enter a description for the accommodation");
            String description = sc.nextLine();
            if (description.isEmpty()){
                System.out.println("Warning description cannot be empty");
            }
            else {
                return description;
            }
        }
    }
    public ArrayList<String> getDescription_of_material(){
        return this.description_of_material;
    }
    public void setDescription_of_material(ArrayList<String> descriptionOfMaterial){
        this.description_of_material = descriptionOfMaterial;
    }
    public static ArrayList<String> enter_description_of_material(Scanner sc){
        ArrayList<String> material = new ArrayList<>();
        String material_temp ;
        while (true){
            System.out.println("Please enter your material description and 'exit' if you doesn't want to add more");
            material_temp = sc.nextLine();

            if (material_temp.isEmpty()){
                System.out.println("Material_description object cannot be empty");
                continue;
            }
            if (material.isEmpty()){
                material.add(material_temp);
            }
            if (material_temp.equalsIgnoreCase("exit")) {
                System.out.println("Description of material was created successfully");
                return material;
            }
            if (material.contains(material_temp.toLowerCase())){
                System.out.println("Material already on the list");
                continue;
            }
            material.add(material_temp.toLowerCase());
        }
    }
}
