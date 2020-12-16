import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class choiceOfType {
    private JFrame selection ;
    private JPanel panel;
    private JButton admin ;
    private JButton teacher ;
    private JButton student;
    JTextArea select ;

    public choiceOfType(){
        selection = new JFrame("portal/type section");
        panel = new JPanel();
        admin = new JButton("Admin");
        teacher = new JButton("Teacher");
        student = new JButton("Student");
        select = new JTextArea("Select Your Type");
    }

    public void makeItems(){
        selection.setSize(250,250);
        selection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);
        select.setBounds(70,10,100,25);
        select.setEditable(false);
        panel.add(select);
        admin.setBounds(70,50,100,25);
        admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selection.setVisible(false);
                LoginFrame myFrame = new LoginFrame();
                myFrame.setSection("  Admin section");
                myFrame.pack();
            }
        });
        panel.add(admin);
        teacher.setBounds(70,90,100,25);
        teacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                selection.setVisible(false);
                LoginFrame myFrame = new LoginFrame();
                myFrame.setSection("  Teacher section");
                myFrame.pack();

            }
        });
        panel.add(teacher);
        student.setBounds(70,130,100,25);
        student.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selection.setVisible(false);
                LoginFrame myFrame = new LoginFrame();
                myFrame.setSection("  Student section");
                myFrame.pack();


            }
        });
        panel.add(student);
        selection.add(panel);
        selection.setVisible(true);
    }

}
