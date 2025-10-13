
import javax.swing.*;
import java.awt.*;

class MaFenetre_connexion {
    public static void main(String[] args) {
        MaFenetre_connexion maFenetreConnexion = new MaFenetre_connexion();
        MaFenetre_Inscription maFenetreInscription = new MaFenetre_Inscription();

        JPanel panel_connexion = maFenetreConnexion.panel_1();

        maFenetreConnexion.Image_booking(panel_connexion);
        maFenetreConnexion.Email(panel_connexion);
        maFenetreConnexion.panel_nom_user(panel_connexion);
        maFenetreConnexion.Label_mdp(panel_connexion);
        maFenetreConnexion.panel_mdp(panel_connexion);
        maFenetreConnexion.connexion(panel_connexion);
        maFenetreConnexion.boutton_inscription(panel_connexion);

        maFenetreConnexion.Frame(panel_connexion);
    }
    public void panel_nom_user(JPanel panel_connexion){
        JTextField nom_utilisateur = new JTextField();
        nom_utilisateur.setBounds(325,250,150,50);
        panel_connexion.add(nom_utilisateur);
    }
    public void panel_mdp(JPanel panel_connexion){
        JTextField mdp = new JTextField();
        mdp.setBounds(325,410,150,50);
        panel_connexion.add(mdp);
    }
    public void Email(JPanel panel_connexion){
        JLabel label = new JLabel("Email");
        panel_connexion.add(label);
        label.setBounds(325,200,150,50);
    }
    public void connexion(JPanel panel_connexion){
        JButton connexion = new JButton("Connexion");
        connexion.setBounds(300,500,200,50);
        panel_connexion.add(connexion);
    }
    public JPanel panel_1(){
        JPanel panel_connexion = new JPanel();
        panel_connexion.setLayout(null);
        return panel_connexion;
    }
    public void Frame(JPanel panel_connexion){
        JFrame frame = new JFrame("Booking ");
        frame.add(panel_connexion);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void Image_booking(JPanel panel_connexion){
        //redimension image 4 next line
        ImageIcon icon = new ImageIcon("C:\\Users\\malar\\IdeaProjects\\le-java-c-est-simple-semaine-1\\bookingpicture.jpg");
        Image img = icon.getImage();
        Image ImagRedi = img.getScaledInstance(150,50,Image.SCALE_SMOOTH);
        icon = new ImageIcon(ImagRedi);
        JLabel label2 = new JLabel(icon);
        label2.setBounds(325,100,150,50);
        panel_connexion.add(label2);
    }
    public void Label_mdp(JPanel panel_connexion){
        JLabel label1 = new JLabel("Mot de passe");
        label1.setBounds(325,350,150,50);
        panel_connexion.add(label1);
    }
    public void boutton_inscription(JPanel panel_connexion){
        JButton inscription = new JButton("inscription");
        //bouton sans bordure etc
        inscription.setBorderPainted(false);
        inscription.setContentAreaFilled(false);
        inscription.setOpaque(false);
        inscription.setBounds(325,600,100,50);
        panel_connexion.add(inscription);
    }
}
class MaFenetre_Inscription{

    public void label_inscription(JPanel jPanel_inscription){
        JLabel insc_user_mail = new JLabel("Email du nouveau compte");
        JLabel insc_user_password = new JLabel("Nouveau mot de passe");
        insc_user_mail.setBounds(325,350,150,50);
        insc_user_password.setBounds(325,350,150,50);
        jPanel_inscription.add(insc_user_mail);
        jPanel_inscription.add(insc_user_password);
    }
    public JPanel panel_inscription(){
        JPanel panel_inscription = new JPanel();
        panel_inscription.setLayout(null);
        return panel_inscription;
    }
    public void boutton_connexion(JPanel panel_inscription){
        JButton connexion = new JButton("connexion");
        //bouton sans bordure etc
        connexion.setBorderPainted(false);
        connexion.setContentAreaFilled(false);
        connexion.setOpaque(false);
        connexion.setBounds(325,600,100,50);
        panel_inscription.add(connexion);
    }
    public void bouton_cree_compte(JPanel panel_inscription){
        JButton button = new JButton("Crée un compte");
        button.setBounds(300,500,200,50);
        panel_inscription.add(button);
    }
    public void panel_nom_user(JPanel panel_inscription){
        JTextField cree_email = new JTextField();
        cree_email.setBounds(325,250,150,50);
        panel_inscription.add(cree_email);
    }
    public void panel_mdp(JPanel panel_inscription){
        JTextField cree_mdp = new JTextField();
        cree_mdp.setBounds(325,410,150,50);
        panel_inscription.add(cree_mdp);
        }
}