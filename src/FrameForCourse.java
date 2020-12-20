import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * gui for add course by teacher
 */
public class FrameForCourse {
    private JFrame one;
    private JFrame two;
    private JFrame three;
    private JPanel oPanel;
    private JPanel tPanel;
    private JPanel thPanel;
    private JButton newB;
    private JButton delete;
    private JTextArea nSection;
    private JLabel name;
    private JLabel units;
    private JLabel day;
    private JLabel time;
    private JTextField myName;
    private JTextField myUnit;
    private JButton sunday;
    private JButton saturday;
    private JButton monday;
    private JButton tuesday;
    private JButton wednesday;
    private JButton t1;
    private JButton t2;
    private JButton t3;
    private JButton add;
    private JTextArea dSection;
    private JLabel order;
    private JTextField type;
    private JButton deleteC;

    public FrameForCourse(){
        one = new JFrame();
        oPanel = new JPanel();
        newB = new JButton("new Class");
        delete = new JButton("Delete class");
        two = new JFrame();
        tPanel = new JPanel();
        nSection = new JTextArea("  new Class  ");
        name = new JLabel("name:");
        units = new JLabel("Units:");
        myName = new JTextField(20);
        myUnit = new JTextField(20);
        day = new JLabel("Day:");
        time = new JLabel("time:");
        saturday = new JButton("saturday");
        sunday = new JButton("sunday");
        monday = new JButton("monday");
        tuesday = new JButton("tuesday");
        wednesday = new JButton("wednesday");
        t1 = new JButton("time one");
        t2 = new JButton("time two");
        t3 = new JButton("time three");
        add =new JButton("Add");
        three = new JFrame();
        thPanel = new JPanel();
        dSection = new JTextArea("  Delete class");
        order = new JLabel("type the name of the course");
        type = new JTextField("");
        deleteC = new JButton("Delete");
    }

    /**
     * three frame had been made.
     */
    private void makeForOne(){
        one.setSize(200,150);
        oPanel.setLayout(null);
        newB.setBackground(Color.ORANGE);
        newB.setBounds(10,20,150,25);
        oPanel.add(newB);
        delete.setBounds(10,60,150,25);
        delete.setBackground(Color.ORANGE);
        oPanel.add(delete);
        newB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                one.setVisible(false);
                packTwo();
            }
        });
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                one.setVisible(false);
                packThree();
            }
        });
    }

    public  void packOne(){
        makeForOne();
        oPanel.setBackground(Color.white);
        one.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        one.add(oPanel);
        one.setVisible(true);
    }

    private void makeForTwo(){
        two.setSize(250,450);
        tPanel.setLayout(null);
        nSection.setBounds(80,10,100,25);
        nSection.setEditable(false);
        nSection.setBackground(Color.MAGENTA);
        tPanel.add(nSection);
        name.setBounds(5,50,100,25);
        tPanel.add(name);
        myName.setBounds(50,50,150,25);
        tPanel.add(myName);
        units.setBounds(5,90,100,25);
        tPanel.add(units);
        myUnit.setBounds(50,90,150,25);
        tPanel.add(myUnit);
        day.setBounds(5,130,100,25);
        tPanel.add(day);
        saturday.setBounds(5,160,100,25);
        saturday.setBackground(Color.pink);
        tPanel.add(saturday);
        sunday.setBounds(120,160,100,25);
        sunday.setBackground(Color.pink);
        tPanel.add(sunday);
        monday.setBounds(5,190,100,25);
        monday.setBackground(Color.pink);
        tPanel.add(monday);
        tuesday.setBounds(120,190,100,25);
        tuesday.setBackground(Color.pink);
        tPanel.add(tuesday);
        wednesday.setBounds(5,220,100,25);
        wednesday.setBackground(Color.PINK);
        tPanel.add(wednesday);
        time.setBounds(5,250,100,25);
        tPanel.add(time);
        t1.setBounds(5,280,100,25);
        t1.setBackground(Color.PINK);
        tPanel.add(t1);
        t2.setBounds(120,280,100,25);
        t2.setBackground(Color.PINK);
        tPanel.add(t2);
        t3.setBounds(5,310,100,25);
        t3.setBackground(Color.PINK);
        tPanel.add(t3);
        add.setBackground(Color.MAGENTA);
        add.setBounds(5,350,100,25);
        tPanel.add(add);
    }

    public  void packTwo(){
        makeForTwo();
        tPanel.setBackground(Color.white);
        two.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        two.add(tPanel);
        two.setVisible(true);
    }

    private void makeForThree(){
        three.setSize(300,180);
        thPanel.setLayout(null);
        dSection.setBounds(70,10,100,25);
        dSection.setBackground(Color.yellow);
        dSection.setEditable(false);
        thPanel.add(dSection);
        order.setBounds(10,40,200,25);
        thPanel.add(order);
        type.setBounds(10,60,150,25);
        thPanel.add(type);
        deleteC.setBackground(Color.yellow);
        deleteC.setBounds(10,100,100,25);
        thPanel.add(deleteC);
        deleteC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String namee = type.getText();

            }
        });
    }

    public  void packThree(){
        makeForThree();
        thPanel.setBackground(Color.white);
        three.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        three.add(thPanel);
        three.setVisible(true);
    }
}
