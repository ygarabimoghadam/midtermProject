import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

/**
 * button for change pass and user for all type and also save in files
 */

public class ChangePassword {
    private JFrame change ;
    private JPanel changePanel ;
    private JLabel user ;
    private JLabel pass;
    private final JPasswordField passwordRepeat ;
    private final  JPasswordField password ;
    private JButton changeButton;
    private JButton btnGet;
    private JButton back;
    private String p;
    private String pr;
    private String newPassword;
    private HashMap<String,String> myAdmins;
    private HashMap<String,String> myStudents = new HashMap<>();
    private HashMap<String,String> myTeachers = new HashMap<>();
    private JFrame changeU;
    private JPanel UPanel;
    private JButton changeUButton;
    private JButton backU;
    private JLabel userNAme;
    private JTextField newUser;
    private String nextUser;
    private String realUser;
    private LogOutAdmin load = new LogOutAdmin();

    public ChangePassword() {

        change = new JFrame("Portal/Changing Password section");
        changePanel = new JPanel();
        user = new JLabel("New Password :");
        pass = new JLabel("Repeat :");
        passwordRepeat = new JPasswordField(20);
        password = new JPasswordField(20);
        changeButton = new JButton("Change");
        btnGet = new JButton("Display Password");
        back= new JButton("back");
        myAdmins = new HashMap<>();
        myAdmins.put("admin1","1234");
        myAdmins.put("admin2","5678");
        changeU = new JFrame("portal/Changing username section");
        UPanel = new JPanel();
        changeUButton = new JButton("change");
        backU = new JButton("back");
        userNAme = new JLabel("new Username:");
        newUser = new JTextField(20);
    }

    /**
     * make item for change pass for all types and also logic
     * @param name name of the user
     */
     public void makeItem(String name){
         back.setBounds(10,10,80,25);
         changePanel.add(back);
         back.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e)  {

                 if(name.startsWith("a")){
                     String fileName = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\myAdmin.txt";
                     myAdmins = load.readFiles(fileName);
                     Admin ad = new Admin(name);
                     change.setVisible(false);
                     ad.packAdmin();
                     myAdmins.put(name,newPassword);
                    load.writeFiles(myAdmins,fileName);
                 }

                 if(name.startsWith("9")){
                     String fileName = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\myStudent.txt";
                     myStudents = load.readFiles(fileName);
                     Student s = new Student(name);
                     change.setVisible(false);
                     s.packStudent();
                     myStudents.put(name,newPassword);
                     load.writeFiles(myStudents,fileName);
                 }

                 if(name.startsWith("3")){
                     String fileName = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\myTeacher.txt";
                     myTeachers = load.readFiles(fileName);
                     Teacher t = new Teacher(name);
                     change.setVisible(false);
                     t.packTeacher();
                     myAdmins.put(name,newPassword);
                     load.writeFiles(myStudents,fileName);
                 }
             }
         });
         change.setSize(320,170);
         change.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         changePanel.setLayout(null);
         user.setBounds(10,40,100,25);
         changePanel.add(user);
         pass.setBounds(10,70,80,25);
         changePanel.add(pass);
         password.setBounds(120,40,165,25);
         user.setLabelFor(password);
         password.setEchoChar('*');
         changePanel.add(password);
         passwordRepeat.setBounds(120,70,165,25);
         passwordRepeat.setEchoChar('*');
         pass.setLabelFor(passwordRepeat);
         changePanel.add(passwordRepeat);
         btnGet.setBounds(120,100,150,25);
         btnGet.addActionListener(
                 new ActionListener() {
                     public void actionPerformed(ActionEvent e) {
                         p = new String(password.getPassword());
                         pr = new String(passwordRepeat.getPassword());
                         if((pr.equals(""))&& (p.equals("")) ){
                             JOptionPane.showMessageDialog(change,
                                     "first enter the pass");
                         }
                         else{
                             JOptionPane.showMessageDialog(change,
                                     "Password is'"+ p+"'passwordRepeat is:'"+pr+"'");}
                     }
                 });
         changePanel.add(btnGet);
         changeButton.setBounds(10, 100, 80, 25);
         changePanel.add(changeButton);
         changeButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 p = new String(password.getPassword());
                 pr = new String(passwordRepeat.getPassword());
                 if(p.length()<8){
                     JOptionPane.showMessageDialog(change,
                             "password must include 8 chars at least");
                     password.setText("");
                     passwordRepeat.setText("");

                 }
                 if(pr.equals(p)){
                     JOptionPane.showMessageDialog(change,
                             "password changed");
                     newPassword = p;
                 }
                 else{
                     JOptionPane.showMessageDialog(change,
                             "please enter both sameThings");
                     password.setText("");
                    passwordRepeat.setText("");
                 }
             }
         });
    }

    /**
     * show gui for change pass
     * @param name
     */
    public void packPass(String name){
         makeItem(name);
         change.getContentPane().add(changePanel);
         change.setVisible(true);
    }

    /**
     * gui and logic for change user and also save in the file.
     * @param n name of the user
     */
    public void makeItemUsername(String n){
        changeU.setSize(300,120);
        changeU.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        UPanel.setLayout(null);
        userNAme.setBounds(10,10,100,25);
        UPanel.add(userNAme);
        newUser.setBounds(110,10,150,25);
        userNAme.setLabelFor(newUser);
        UPanel.add(newUser);
        changeUButton.setBounds(20,40,80,25);
        UPanel.add(changeUButton);
        backU.setBounds(150,40,80,25);
        UPanel.add(backU);
        changeUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(n.startsWith("a")) {
                    String fileName = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\myAdmin.txt";
                    myAdmins = load.readFiles(fileName);
                    nextUser = newUser.getText();
                    if (myAdmins.containsKey(nextUser)) {
                        JOptionPane.showMessageDialog(changeU, "this username is chosen before");
                        newUser.setText("");
                    }
                    if (nextUser.equals("")) {
                        JOptionPane.showMessageDialog(changeU, "please enter username first");

                    } else if (!(myAdmins.containsKey(nextUser))) {
                        JOptionPane.showMessageDialog(changeU, "username change");
                        realUser = nextUser;
                    }
                }
                if(n.startsWith("9")) {
                    String fileName = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\myStudent.txt";
                    myStudents = load.readFiles(fileName);
                    nextUser = newUser.getText();
                    if (myStudents.containsKey(nextUser)) {
                        JOptionPane.showMessageDialog(changeU, "this username is chosen before");
                        newUser.setText("");
                    }

                    if (nextUser.equals("")) {
                        JOptionPane.showMessageDialog(changeU, "please enter username first");

                    } else if (!(myStudents.containsKey(nextUser))) {
                        JOptionPane.showMessageDialog(changeU, "username change");
                        realUser = nextUser;
                    }
                }
                if(n.startsWith("3")) {
                    String fileName = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\myTeacher.txt";
                    myTeachers = load.readFiles(fileName);
                    nextUser = newUser.getText();
                    if (myTeachers.containsKey(nextUser)) {
                        JOptionPane.showMessageDialog(changeU, "this username is chosen before");
                        newUser.setText("");
                    }
                    if (nextUser.equals("")) {
                        JOptionPane.showMessageDialog(changeU, "please enter username first");
                    } else if (!(myTeachers.containsKey(nextUser))) {
                        JOptionPane.showMessageDialog(changeU, "username change");
                        realUser = nextUser;
                    }
                }
            }
        });

        backU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (n.startsWith("a")) {
                    String fileName = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\myAdmin.txt";
                    myAdmins = load.readFiles(fileName);
                    Admin ad = new Admin(n);
                    changeU.setVisible(false);
                    ad.packAdmin();
                    String p = myAdmins.get(n);
                    myAdmins.remove(n);
                    myAdmins.put(realUser,p);
                    load.writeFiles(myAdmins,fileName);
                }

                if (n.startsWith("9")) {
                    String fileName = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\myStudent.txt";
                    myStudents = load.readFiles(fileName);
                    Student s = new Student(n);
                    changeU.setVisible(false);
                    s.packStudent();
                    String p = myStudents.get(n);
                    myStudents.remove(n);
                    myStudents.put(realUser,p);
                    load.writeFiles(myStudents,fileName);
                }

                if (n.startsWith("3")) {
                    String fileName = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\myTeacher.txt";
                    myTeachers = load.readFiles(fileName);
                    Teacher t = new Teacher(n);
                    changeU.setVisible(false);
                    t.packTeacher();
                    String p = myTeachers.get(n);
                    myTeachers.remove(n);
                    myTeachers.put(realUser,p);
                    load.writeFiles(myTeachers,fileName);
                }
            }
        });
    }

    /**
     * show gui for change user.
     * @param n
     */
    public void packUser(String n){
        makeItemUsername(n);
        changeU.getContentPane().add(UPanel);
        changeU.setVisible(true);
    }


}
