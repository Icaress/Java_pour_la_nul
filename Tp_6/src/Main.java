
import javax.swing.*;
import java.awt.*;

class MaFenetre {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Booking ");
        JPanel panel = new JPanel();
        JButton connexion = new JButton("Connexion");
        JLabel label = new JLabel("Nom d'utilisateur");
        JLabel label1 = new JLabel("Mot de passe");
        JTextField nom_utilisateur = new JTextField();
        JTextField mdp = new JTextField();
        JButton inscription = new JButton("inscription");
        inscription.setBorderPainted(false);
        inscription.setContentAreaFilled(false);
        inscription.setOpaque(false);
        //redimension image
        ImageIcon icon = new ImageIcon("C:\\Users\\malar\\IdeaProjects\\le-java-c-est-simple-semaine-1\\bookingpicture.jpg");
        Image img = icon.getImage();
        Image ImagRedi = img.getScaledInstance(150,50,Image.SCALE_SMOOTH);
        icon = new ImageIcon(ImagRedi);
        JLabel label2 = new JLabel(icon);
        //redimension image
        panel.setLayout(null);
        mdp.setBounds(325,410,150,50);
        nom_utilisateur.setBounds(325,250,150,50);
        label2.setBounds(325,100,150,50);
        label1.setBounds(325,350,150,50);
        label.setBounds(325,200,150,50);
        connexion.setBounds(300,500,200,50);
        inscription.setBounds(325,600,100,50);
        panel.add(inscription);
        panel.add(mdp);
        panel.add(nom_utilisateur);
        panel.add(label2);
        panel.add(label1);
        panel.add(label);
        panel.add(connexion);
        frame.add(panel);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
