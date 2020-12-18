import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class LoginFrame {
   private JFrame log ;
   private JPanel logPanel ;
   private JLabel user ;
   private JLabel pass;
   private JTextField userText ;
   private final  JPasswordField pfPassword ;
   private JTextArea section ;
   private JButton logButton;
   private JButton btnGet ;
   private String myPass ;
   private String myUser ;


   public LoginFrame(){
        log = new JFrame("Portal/login section");
        logPanel = new JPanel();
        user = new JLabel("Username :");
        pass = new JLabel("Password :");
        userText = new JTextField(20);
        pfPassword = new JPasswordField(20);
        section = new JTextArea("  ");
        logButton = new JButton("Login");
        btnGet = new JButton("Display Password");
    }

    private void MakeFrame(){
        log.setSize(300,170);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void MakePanel(){
        logPanel.setLayout(null);
    }

    private void MakeLabel(){
        user.setBounds(10,40,80,25);
        logPanel.add(user);
        pass.setBounds(10,70,80,25);
        logPanel.add(pass);
    }

    private void makeText(){
       section.setBounds(5,5,100,25);
       section.setBackground(Color.CYAN);
       section.setEditable(false);
       logPanel.add(section);
       userText.setBounds(100,40,165,25);
       user.setLabelFor(userText);
       logPanel.add(userText);
       pfPassword.setBounds(100,70,165,25);
       pfPassword.setEchoChar('*');
       pass.setLabelFor(pfPassword);
       logPanel.add(pfPassword);
    }

    public void makeButton() {
        btnGet.setBounds(100,100,150,25);
        btnGet.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        String password = new String(pfPassword.getPassword());
                        if(password.equals("")){
                            JOptionPane.showMessageDialog(log,
                                    "first enter the pass");

                        }
                        else{
                        JOptionPane.showMessageDialog(log,
                                "Password is " + password);}
                    }
                });
       logPanel.add(btnGet);
        logButton.setBounds(10, 100, 80, 25);
        logPanel.add(logButton);
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file;
                Scanner scanner;
                String loginn = "";
                String passwordd = null;
                 myPass = new String(pfPassword.getPassword());
                 myUser = userText.getText();
                if ((section.getText()).equals("  Admin section")) {
                    try {
                        file = new File("C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\myAdmin.txt");
                        scanner = new Scanner(file);

                        while (!(loginn.equals(myUser))) {
                            loginn = scanner.nextLine();
                        }
                        passwordd = scanner.nextLine();

                    } catch (FileNotFoundException er) {
                        er.printStackTrace();
                    }

                    if (myPass.equals(passwordd)) {
                        System.out.println("done");
                        log.setVisible(false);
                        Admin ad = new Admin(myUser);
                        ad.packAdmin();
                        //add new frame here
                    }
                    else{
                        JOptionPane.showMessageDialog(log,
                                "Wrong pass.try again!");
                        userText.setText("");
                        pfPassword.setText("");

                    }

                }

                else if((section.getText()).equals("  Teacher section")){

                    try {
                        file = new File("C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\myTeacher.txt");
                        scanner = new Scanner(file);

                        while (!(loginn.equals(myUser))) {
                            loginn = scanner.nextLine();
                        }
                        passwordd = scanner.nextLine();

                    } catch (FileNotFoundException er) {
                        er.printStackTrace();
                    }

                    if (myPass.equals(passwordd)) {
                        System.out.print("done");
                        log.setVisible(false);
                        Teacher myTeacher = new Teacher();
                        myTeacher.packTeacher();
                        //add new frame here
                    }
                    else{
                        JOptionPane.showMessageDialog(log,
                                "Wrong pass.try again!");
                        userText.setText("");
                        pfPassword.setText("");

                    }

                }

                else if((section.getText()).equals("  Student section")){
                    try {
                        file = new File("C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\myStudent.txt");
                        scanner = new Scanner(file);

                        while (!(loginn.equals(myUser))) {
                            loginn = scanner.nextLine();
                        }
                        passwordd = scanner.nextLine();

                    } catch (FileNotFoundException er) {
                        er.printStackTrace();
                    }

                    if (myPass.equals(passwordd)) {

                        System.out.print("done");

                        log.setVisible(false);
                        Student myStudent = new Student();
                        myStudent.packStudent();
                        //add new frame here
                    }

                    else{
                        JOptionPane.showMessageDialog(log,
                                "Wrong pass.try again!");
                        userText.setText("");
                        pfPassword.setText("");

                    }
                }
            }
        });
    }

    public void setSection(String str) {
        section.setText(str);
    }

    public void pack(){
        MakeFrame();
        MakePanel();
        MakeLabel();
        makeText();
        makeButton();
        log.getContentPane().add(logPanel);
        log.setVisible(true);
    }

    public String getMyUser() {
        return myUser;
    }
}
