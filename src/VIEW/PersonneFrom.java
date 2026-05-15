package VIEW;

import javax.swing.*;
import java.awt.*;
public class PersonneFrom{
public static void main (String[] args) {
    new PersonneFrom();
    }
//creation de la fenetre
    JFrame fenetre= new JFrame("BankIntec");
public PersonneFrom(){
    fenetre.setSize(500,600);
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fenetre.setLayout(null);
    //Label ID
    JLabel ID=new JLabel("ID");
    ID.setBounds(30,30,110,25);
    fenetre.add(ID);
    //Textfiel ID
    JTextField txtID = new JTextField();
    txtID.setBounds(150,30,200,25);
    fenetre.add(txtID);
    //Label Nom
    JLabel Nom =new JLabel("Nom:");
    Nom.setBounds(30,70,110,25);
    fenetre.add(Nom);
    //
}

}
