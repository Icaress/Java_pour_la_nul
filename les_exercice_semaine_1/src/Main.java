import java.lang.annotation.Target;

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