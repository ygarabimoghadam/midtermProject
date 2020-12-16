import javax.swing.*;
import java.awt.*;

public class Teacher {

    private JFrame teach ;
    private JPanel teachPanel;
    private JTextField type ;
    private JButton changePass;
    private JButton changeUsername;
    private JButton viewS;
    private JButton addScore;
    private JButton addC;
    private JButton logOut;

    public Teacher(){

        teach = new JFrame("Portal/teacher section");
        teachPanel = new JPanel();
        type = new JTextField("Teacher section:choose ");
        changePass = new JButton("Change Password");
        changeUsername = new JButton("Change UserName");
        viewS = new JButton("View Student");
        addScore = new JButton("Add Score");
        addC = new JButton("Add new Class");
        logOut = new JButton("Logout");
    }

    private void makeFrame(){
        teach.setSize(400,270);
        teach.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teachPanel.setLayout(null);
    }

    private void makeButton(){
        type.setBounds(120,5,150,25);
        type.setBackground(Color.ORANGE);
        type.setEditable(false);
        teachPanel.add(type);
        changePass.setBounds(120,40,150,25);
        changePass.setBackground(Color.green);
        teachPanel.add(changePass);
        changeUsername.setBounds(120,70,150,25);
        changeUsername.setBackground(Color.green);
        teachPanel.add(changeUsername);
        viewS.setBounds(120,100,150,25);
        viewS.setBackground(Color.green);
        teachPanel.add(viewS);
        addScore.setBounds(120,130,150,25);
        addScore.setBackground(Color.green);
        teachPanel.add(addScore);
        addC.setBounds(120,160,150,25);
        addC.setBackground(Color.green);
        teachPanel.add(addC);
        logOut.setBounds(120,190,150,25);
        logOut.setBackground(Color.green);
        teachPanel.add(logOut);
    }

    public void packTeacher(){
        makeFrame();
        makeButton();
        teach.getContentPane().add(teachPanel);
        teachPanel.setBackground(Color.black);
        teach.setVisible(true);
    }
}
