import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Admin {
    private JFrame adm ;
    private JPanel adPanel;
    private JTextField type ;
    private JButton changePass;
    private JButton changeUsername;
    private JButton viewT ;
    private JButton viewS;
    private JButton viewC;
    private JButton setMeal;
    private JButton addS;
    private JButton addT;
    private JButton logOut;
    private HashMap<String,String> myAdmins;

    public Admin(){

        adm = new JFrame("Portal/admin section");
        adPanel = new JPanel();
        type = new JTextField("Admin section:choose ");
        changePass = new JButton("Change Password");
        changeUsername = new JButton("Change UserName");
        viewT = new JButton("View Teacher");
        viewS = new JButton("View Student");
        viewC = new JButton("view Courses");
        setMeal = new JButton("Set meal");
        addS= new JButton("Add Student");
        addT = new JButton("Add Teacher");
        logOut = new JButton("Logout");
        myAdmins = new HashMap<>();
    }

    private void makeFrame(){
        adm.setSize(400,350);
        adm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        adPanel.setLayout(null);
    }

    private void makeButton(){
        type.setBounds(120,5,150,25);
        type.setBackground(Color.PINK);
        type.setEditable(false);
        adPanel.add(type);
        changePass.setBounds(120,40,150,25);
        changePass.setBackground(Color.MAGENTA);
        adPanel.add(changePass);
        changeUsername.setBounds(120,70,150,25);
        changeUsername.setBackground(Color.MAGENTA);
        adPanel.add(changeUsername);
        viewS.setBounds(120,100,150,25);
        viewS.setBackground(Color.MAGENTA);
        adPanel.add(viewS);
        viewT.setBounds(120,130,150,25);
        viewT.setBackground(Color.MAGENTA);
        adPanel.add(viewT);
        viewC.setBounds(120,160,150,25);
        viewC.setBackground(Color.MAGENTA);
        adPanel.add(viewC);
        setMeal.setBounds(120,190,150,25);
        setMeal.setBackground(Color.MAGENTA);
        adPanel.add(setMeal);
        addS.setBounds(120,220,150,25);
        addS.setBackground(Color.MAGENTA);
        adPanel.add(addS);
        addT.setBounds(120,250,150,25);
        addT.setBackground(Color.MAGENTA);
        adPanel.add(addT);
        logOut.setBounds(120,280,150,25);
        logOut.setBackground(Color.MAGENTA);
        adPanel.add(logOut);
    }

    public void packAdmin(){
        makeFrame();
        makeButton();
        adm.getContentPane().add(adPanel);
        adPanel.setBackground(Color.BLACK);
        adm.setVisible(true);
    }

    public HashMap<String, String> getMyAdmins() {
        return myAdmins;
    }

    public void setMAp(){
        
    }
}
