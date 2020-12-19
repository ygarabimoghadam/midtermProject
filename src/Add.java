import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class Add {
    private JFrame addS;
    private JFrame addT;
    private JPanel panelS;
    private JPanel panelT;
    private JTextArea textS;
    private JTextArea textT;
    private JLabel nameS;
    private JLabel nameT;
    private JLabel passS;
    private JLabel passT;
    private JTextField usernameS;
    private JTextField usernameT;
    private JTextField passwordS;
    private JTextField passwordT;
    private JButton addButtonS;
    private JButton addButtonT;
    private JButton backS;
    private JButton backT;
    private ArrayList<StudentInCourses> students = new ArrayList<>();
    private ArrayList<TeacheInCourses> teachers = new ArrayList<>();
    private HashMap<String , String> newStudents = new HashMap<>();
    private HashMap<String , String> newTeachers = new HashMap<>();
    private LogOutAdmin load = new LogOutAdmin();
    private int counterS ;
    private int counterT ;

    public Add() {
        addS = new JFrame("portal/add section");
        panelS = new JPanel();
        textS = new JTextArea(" Add Student");
        nameS = new JLabel("Username:");
        passS = new JLabel("Password:");
        usernameS = new JTextField(20);
        passwordS = new JTextField(20);
        addButtonS = new JButton("Add");
        backS = new JButton("back");
        addT = new JFrame("portal/add section");
        panelT = new JPanel();
        textT = new JTextArea("Add Teacher");
        nameT = new JLabel("Username:");
        passT = new JLabel("Password:");
        usernameT = new JTextField(20);
        passwordT = new JTextField(20);
        addButtonT = new JButton("Add");
        backT = new JButton("back");
    }

    private void makeItemsForStudents() {

        addS.setSize(300, 220);
        panelS.setLayout(null);
        textS.setBounds(100, 5, 80, 25);
        textS.setBackground(Color.MAGENTA);
        textS.setEditable(false);
        panelS.add(textS);
        nameS.setBounds(20, 40, 100, 25);
        panelS.add(nameS);
        usernameS.setBounds(100, 40, 150, 25);
        panelS.add(usernameS);
        passS.setBounds(20, 80, 100, 25);
        panelS.add(passS);
        passwordS.setBounds(100, 80, 150, 25);
        panelS.add(passwordS);
        addButtonS.setBounds(20, 120, 100, 25);
        addButtonS.setBackground(Color.pink);
        panelS.add(addButtonS);
        backS.setBackground(Color.PINK);
        backS.setBounds(140, 120, 100, 25);
        panelS.add(backS);
        addButtonS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String forPassword = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\myStudent.txt";
                String user = usernameS.getText();
                String passs = passwordS.getText();
                newStudents = load.readFiles(forPassword);
                if (user.equals("") || passs.equals("")) {
                    JOptionPane.showMessageDialog(addS, "please enter probably");
                }
                if (passs.length() < 8) {
                    JOptionPane.showMessageDialog(addS, "password must at least have 6 chars");
                    passwordS.setText("");
                }
                if (newStudents.containsKey(user)) {
                    JOptionPane.showMessageDialog(addS, "this username have been used");
                    passwordS.setText("");
                    usernameS.setText("");
                } else if (passs.length() >= 8 || !(user.equals("")) || !(passs.equals("")) && !(newStudents.containsKey(user))) {
                    JOptionPane.showMessageDialog(addS, "Student saved");
                    passwordS.setText("");
                    usernameS.setText("");
                    StudentInCourses s1 = new StudentInCourses(user, passs);
                    newStudents.put(user,passs);
                    load.writeFiles(newStudents,forPassword);
                    String name = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\counterS.txt";
                    counterS = load.readCounter(name);
                    String fileName = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\students\\student" + counterS + ".txt";
                    load.writeSerialize(fileName, s1);
                    counterS++;
                    load.writeCounter(name , counterS);
                }
            }
        });
        backS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                addS.setVisible(false);
                Admin ad = new Admin("");
                ad.packAdmin();
            }
        });
    }

    public void packAddStudents() {
        makeItemsForStudents();
        panelS.setBackground(Color.gray);
        addS.getContentPane().add(panelS);
        addS.setVisible(true);
    }

    private void makeItemsForTeachers() {

        addT.setSize(300, 220);
        panelT.setLayout(null);
        textT.setBounds(100, 5, 80, 25);
        textT.setBackground(Color.MAGENTA);
        textT.setEditable(false);
        panelT.add(textT);
        nameT.setBounds(20, 40, 100, 25);
        panelT.add(nameT);
        usernameT.setBounds(100, 40, 150, 25);
        panelT.add(usernameT);
        passT.setBounds(20, 80, 100, 25);
        panelT.add(passT);
        passwordT.setBounds(100, 80, 150, 25);
        panelT.add(passwordT);
        addButtonT.setBounds(20, 120, 100, 25);
        addButtonT.setBackground(Color.pink);
        panelT.add(addButtonT);
        backT.setBackground(Color.PINK);
        backT.setBounds(140, 120, 100, 25);
        panelT.add(backT);
        addButtonT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String forPassword = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\myTeacher.txt";
                String user = usernameT.getText();
                String passs = passwordT.getText();
                newTeachers = load.readFiles(forPassword);
                    if (newTeachers.containsKey(user)) {
                        JOptionPane.showMessageDialog(addT, "this username have been used");
                        passwordT.setText("");
                        usernameT.setText("");

                }
                if (user.equals("") || passs.equals("")) {
                    JOptionPane.showMessageDialog(addT, "please enter probably");
                }
                if (passs.length() < 8) {
                    JOptionPane.showMessageDialog(addT, "password must at least have 6 chars");
                    passwordT.setText("");
                } else if (passs.length() >= 8 || !(user.equals("")) || !(passs.equals("")) && !(newTeachers.containsKey(user))) {
                    JOptionPane.showMessageDialog(addT, "teacher saved");
                    passwordT.setText("");
                    usernameT.setText("");
                    TeacheInCourses t1 = new TeacheInCourses(user, passs);
                    newTeachers.put(user,passs);
                    load.writeFiles(newTeachers,forPassword);
                    String name = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\CounterT.txt";
                    counterT = load.readCounter(name);
                    String fileName = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\teachers\\teacher" + counterT + ".txt";
                    load.writeSerialize(fileName, t1);
                    counterT++;
                    load.writeCounter(name ,counterT);
                }
            }
        });
        backT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addT.setVisible(false);
                Admin ad = new Admin("");
                ad.packAdmin();
            }
        });
    }

    public void packAddTeachers() {
        makeItemsForTeachers();
        panelT.setBackground(Color.gray);
        addT.getContentPane().add(panelT);
        addT.setVisible(true);
    }
}
