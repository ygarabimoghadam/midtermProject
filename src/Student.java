import javax.swing.*;
import java.awt.*;

public class Student {

    private JFrame stud ;
    private JPanel studPanel;
    private JTextField type ;
    private JButton changePass;
    private JButton changeUsername;
    private JButton chargeAccount;
    private JButton seeMeals;
    private JButton chooseClass;
    private JButton logOut;

    public Student(){

        stud = new JFrame("Portal/student section");
        studPanel = new JPanel();
        type = new JTextField("Student section:choose ");
        changePass = new JButton("Change Password");
        changeUsername = new JButton("Change UserName");
        chargeAccount = new JButton("Charge Account");
        seeMeals = new JButton("See meals");
        chooseClass = new JButton("Choose Class");
        logOut = new JButton("Logout");
    }

    private void makeFrame(){
        stud.setSize(400,270);
        stud.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studPanel.setLayout(null);
    }

    private void makeButton(){
        type.setBounds(120,5,150,25);
        type.setBackground(Color.white);
        type.setEditable(false);
        studPanel.add(type);
        changePass.setBounds(120,40,150,25);
        changePass.setBackground(Color.yellow);
        studPanel.add(changePass);
        changeUsername.setBounds(120,70,150,25);
        changeUsername.setBackground(Color.yellow);
        studPanel.add(changeUsername);
        chargeAccount.setBounds(120,100,150,25);
        chargeAccount.setBackground(Color.yellow);
        studPanel.add(chargeAccount);
        seeMeals.setBounds(120,130,150,25);
        seeMeals.setBackground(Color.yellow);
        studPanel.add(seeMeals);
        chooseClass.setBounds(120,160,150,25);
        chooseClass.setBackground(Color.yellow);
        studPanel.add(chooseClass);
        logOut.setBounds(120,190,150,25);
        logOut.setBackground(Color.yellow);
        studPanel.add(logOut);
    }

    public void packStudent(){
        makeFrame();
        makeButton();
        stud.getContentPane().add(studPanel);
        studPanel.setBackground(Color.black);
        stud.setVisible(true);
    }

}
