package VIEW;

import javax.swing.*;

public class CompteFrom {
    public static void main(String[] args) {
        new CompteFrom();
    }

    //Creation de La fenêtre
    JFrame fenetre = new JFrame("BankIntec");
    public CompteFrom() {
        fenetre.setSize(500,400);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLayout(null);
        //Label code
        JLabel code = new JLabel("code");
        code.setBounds(30,30,80,25);
        fenetre.add(code);
        //Textfiel code
        JTextField txtCode= new JTextField();
        txtCode.setBounds(120,30,150,25);
        fenetre.add(txtCode);
        //Label solde
        JLabel solde = new JLabel("solde:");
        solde.setBounds(30,70,80,25);
        fenetre.add(solde);
        fenetre.setVisible(true);
        }
}
