import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.HashMap;

/**
 * set meals by admin . for lunch and dinner .
 */
public class Meal {
   private JFrame whichMeal;
   private JPanel whmPanel;
   private JLabel lunch ;
   private JLabel dinner ;
   private JButton lButton;
   private JButton DButton;
   private JMenuBar menuBar;
   private JMenu menu;
   private JMenuItem back;
    private JFrame whichDay;
    private JPanel whdPanel;
    private JTextArea question;
    private JLabel day1;
    private JLabel day2;
    private JLabel day3;
    private JLabel day4;
    private JLabel day5;
    private JButton d1;
    private JButton d2;
    private JButton d3;
    private JButton d4;
    private JButton d5;
    private JMenuBar dMenuBar;
    private JMenu dMenu;
    private JMenuItem dBack;
    private JMenuItem dBackM;
     private JFrame lunchMeal;
     private JPanel lmPanel;
     private JTextArea questionL;
     private JLabel ml1;
     private JLabel ml2;
     private JLabel ml3;
     private JLabel ml4;
     private JLabel ml5;
     private JLabel ml6;
     private JLabel ml7;
     private JLabel ml8;
     private JButton bl1;
     private JButton bl2;
     private JButton bl3;
     private JButton bl4;
     private JButton bl5;
     private JButton bl6;
     private JButton bl7;
     private JButton bl8;
     private JMenuBar MLMenuBar;
     private JMenu MLMenu;
     private JMenuItem lBack;
     private JMenuItem lBackM;
      private JFrame dinnerMeal;
      private JPanel dmPanel;
      private JTextArea questionD;
      private JLabel md1;
      private JLabel md2;
      private JLabel md3;
      private JLabel md4;
      private JLabel md5;
      private JLabel md6;
      private JLabel md7;
      private JLabel md8;
      private JButton bd1;
      private JButton bd2;
      private JButton bd3;
      private JButton bd4;
      private JButton bd5;
      private JButton bd6;
      private JButton bd7;
      private JButton bd8;
      private JMenuBar MDMenuBar;
      private JMenu MDMenu;
      private JMenuItem dmBack;
      private JMenuItem dmBackM;
       boolean lunchH;
       boolean dinnerR;
       private HashMap<String, String> lunchForWeak;
       private HashMap<String,String> dinnerForWeak;
       private String l;
       private String d;
       private LogOutAdmin load = new LogOutAdmin();
       private String FileForLunch = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\Lunch.txt";
       private String FileForDinner = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\Dinner.txt";

       public Meal(){
        whichMeal = new JFrame("set meal section");
        whmPanel = new JPanel();
        lunch = new JLabel("lunch");
        dinner = new JLabel("dinner");
        lButton = new JButton("choose");
        DButton= new JButton("choose");
        menuBar = new JMenuBar();
        menu = new JMenu("Option");
        back = new JMenuItem("Back");
        whichDay = new JFrame("set Day");
        whdPanel = new JPanel();
        question = new JTextArea("  which Day? ");
        day1 = new JLabel("saturday");
        day2 = new JLabel("sunday");
        day3 = new JLabel("monday");
        day4 = new JLabel("tuesday");
        day5 = new JLabel("wednesday");
        d1 = new JButton("choose");
        d2 = new JButton("choose");
        d3 = new JButton("choose");
        d4 = new JButton("choose");
        d5 = new JButton("choose");
        dMenuBar = new JMenuBar();
        dMenu = new JMenu("Options");
        dBack = new JMenuItem("back");
        dBackM = new JMenuItem("back to mainMenu");
        lunchMeal= new JFrame();
        lmPanel = new JPanel();
        questionL = new JTextArea("which meal?");
         ml1 = new JLabel("pizza");
         ml2 = new JLabel("hamburger");
         ml3 = new JLabel("sandwich");
         ml4 = new JLabel("ghorme sabzi");
         ml5 = new JLabel("gheyme");
         ml6 = new JLabel("abgusht");
         ml7 = new JLabel("juje");
         ml8 = new JLabel("kabab");
         bl1 = new JButton("choose");
         bl2 = new JButton("choose");
         bl3 = new JButton("choose");
         bl4 = new JButton("choose");
         bl5 = new JButton("choose");
         bl6 = new JButton("choose");
         bl7 = new JButton("choose");
         bl8 = new JButton("choose");
         MLMenuBar = new JMenuBar();
         MLMenu = new JMenu("options");
         lBack = new JMenuItem("back");
         lBackM = new JMenuItem("back to main menu");
         dinnerMeal= new JFrame();
         dmPanel = new JPanel();
         questionD = new JTextArea("which meal?");
         md1 = new JLabel("sibzamini");
         md2 = new JLabel("kuku");
         md3 = new JLabel("sandwich");
         md4 = new JLabel("kotlet");
         md5 = new JLabel("makaruni");
         md6 = new JLabel("hot dog");
         md7 = new JLabel("juje");
         md8 = new JLabel("tahchin");
         bd1 = new JButton("choose");
         bd2 = new JButton("choose");
         bd3 = new JButton("choose");
         bd4 = new JButton("choose");
         bd5 = new JButton("choose");
         bd6 = new JButton("choose");
         bd7 = new JButton("choose");
         bd8 = new JButton("choose");
         MDMenuBar = new JMenuBar();
         MDMenu = new JMenu("options");
         dmBack = new JMenuItem("back");
         dmBackM = new JMenuItem("back to main menu");
         lunchForWeak = new HashMap<>();
         dinnerForWeak = new HashMap<>();
     }

    private void makeItemForMeal(){

        whichMeal.setSize(250,150);
        whmPanel.setLayout(null);
        lunch.setBounds(5,5,100,25);
        whmPanel.add(lunch);
        lButton.setBounds(70,5,80,25);
        lButton.setBackground(Color.CYAN);
        whmPanel.add(lButton);
        dinner.setBounds(5,50,100,25);
        whmPanel.add(dinner);
        DButton.setBounds(70,50,80,25);
        DButton.setBackground(Color.CYAN);
        whmPanel.add(DButton);
        menu.add(back);
        menuBar.add(menu);
        lButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                whichMeal.setVisible(false);
                packDay();
                lunchH = true;
            }});
        DButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                whichMeal.setVisible(false);
                packDay();
                dinnerR = true;
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                whichMeal.setVisible(false);
                Admin ad = new Admin("");
                ad.packAdmin();
            }
        });
        back.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
     }

    public void packMeal(){
        makeItemForMeal();
        whmPanel.setBackground(Color.white);
        whichMeal.getContentPane().add(whmPanel);
        whichMeal.setJMenuBar(menuBar);
        whichMeal.setVisible(true);
       }

    private void makeItemForDays(){

        whichDay.setSize(270,250);
        whdPanel.setLayout(null);
        question.setBounds(5,5,80,20);
        question.setBackground(Color.CYAN);
        question.setEditable(false);
        whdPanel.add(question);
        day1.setBounds(20,30,100,25);
        whdPanel.add(day1);
        d1.setBounds(100,30,100,25);
        d1.setBackground(Color.CYAN);
        whdPanel.add(d1);
        day2.setBounds(20,60,100,25);
        whdPanel.add(day2);
        d2.setBounds(100,60,100,25);
        d2.setBackground(Color.CYAN);
        whdPanel.add(d2);
        day3.setBounds(20,90,100,25);
        whdPanel.add(day3);
        d3.setBounds(100,90,100,25);
        d3.setBackground(Color.CYAN);
        whdPanel.add(d3);
        day4.setBounds(20,120,100,25);
        whdPanel.add(day4);
        d4.setBounds(100,120,100,25);
        d4.setBackground(Color.CYAN);
        whdPanel.add(d4);
        day5.setBounds(20,150,100,25);
        whdPanel.add(day5);
        d5.setBounds(100,150,100,25);
        d5.setBackground(Color.CYAN);
        whdPanel.add(d5);
        dMenu.add(dBack);
        dMenu.add(dBackM);
        dMenuBar.add(dMenu);
        d1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                whichDay.setVisible(false);
                if(lunchH){
                    packLunch();
                    l="1";}
                else{
                    packDinner();
                     d="1";}
            }
        });

        d2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                whichDay.setVisible(false);
                if(lunchH){
                    packLunch();
                    l="2";}
                else{
                    packDinner();
                    d="2";}
            }
        });

        d3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                whichDay.setVisible(false);
                if(lunchH){
                    packLunch();
                    l="3";}
                else{
                    packDinner();
                    d="3";}
            }
        });

        d4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                whichDay.setVisible(false);
                if(lunchH){
                    packLunch();
                    l="4";}
                else{
                    packDinner();
                    d="4";}
            }
        });

        d5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                whichDay.setVisible(false);
                if(lunchH){
                    packLunch();
                    l="5";}
                else{
                    packDinner();
                    d="5";}
            }
        });
        dBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                whichDay.setVisible(false);
                packMeal();
            }
        });
        dBackM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                whichDay.setVisible(false);
                Admin ad = new Admin("");
                ad.packAdmin();
            }
        });
        dBackM.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
     }

    public void packDay(){
        makeItemForDays();
        whdPanel.setBackground(Color.white);
        whichDay.getContentPane().add(whdPanel);
        whichDay.setJMenuBar(dMenuBar);
        whichDay.setVisible(true);
    }

    private void makeItemForLunch() {
        lunchMeal.setSize(270, 350);
        lmPanel.setLayout(null);
        questionL.setEditable(false);
        questionL.setBounds(5, 5, 80, 20);
        lmPanel.add(questionL);
        ml1.setBounds(20, 30, 110, 20);
        lmPanel.add(ml1);
        bl1.setBounds(100, 30, 110, 25);
        bl1.setBackground(Color.CYAN);
        lmPanel.add(bl1);
        ml2.setBounds(20, 60, 110, 20);
        lmPanel.add(ml2);
        bl2.setBounds(100, 60, 110, 25);
        bl2.setBackground(Color.CYAN);
        lmPanel.add(bl2);
        ml3.setBounds(20, 90, 110, 20);
        lmPanel.add(ml3);
        bl3.setBounds(100, 90, 110, 25);
        bl3.setBackground(Color.CYAN);
        lmPanel.add(bl3);
        ml4.setBounds(20, 120, 110, 20);
        lmPanel.add(ml4);
        bl4.setBounds(100, 120, 110, 25);
        bl4.setBackground(Color.CYAN);
        lmPanel.add(bl4);
        ml5.setBounds(20, 150, 110, 20);
        lmPanel.add(ml5);
        bl5.setBounds(100, 150, 110, 25);
        bl5.setBackground(Color.CYAN);
        lmPanel.add(bl5);
        ml6.setBounds(20, 180, 110, 20);
        lmPanel.add(ml6);
        bl6.setBounds(100, 180, 110, 25);
        bl6.setBackground(Color.CYAN);
        lmPanel.add(bl6);
        ml7.setBounds(20, 210, 110, 20);
        lmPanel.add(ml7);
        bl7.setBounds(100, 210, 110, 25);
        bl7.setBackground(Color.CYAN);
        lmPanel.add(bl7);
        ml8.setBounds(20, 240, 110, 20);
        lmPanel.add(ml8);
        bl8.setBounds(100, 240, 110, 25);
        bl8.setBackground(Color.CYAN);
        lmPanel.add(bl8);
        MLMenu.add(lBack);
        MLMenu.add(lBackM);
        MLMenuBar.add(MLMenu);
        lunchForWeak = load.readFiles(FileForLunch);
        bl1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lunchForWeak.put(l, ml1.getText());
                load.writeFiles(lunchForWeak,FileForLunch);
                JOptionPane.showMessageDialog(lunchMeal, "food pick for day " +l);


            }
        });
        bl2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lunchForWeak.put(l, ml2.getText());
                load.writeFiles(lunchForWeak,FileForLunch);
                JOptionPane.showMessageDialog(lunchMeal,"food pick for day "+l);

            }
        });

        bl3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lunchForWeak.put(l, ml3.getText());
                load.writeFiles(lunchForWeak,FileForLunch);
                JOptionPane.showMessageDialog(lunchMeal,"food pick for day "+l);

            }
        });

        bl4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lunchForWeak.put(l, ml4.getText());
                load.writeFiles(lunchForWeak,FileForLunch);
                JOptionPane.showMessageDialog(lunchMeal,"food pick for day "+l);

            }
        });

        bl5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lunchForWeak.put(l, ml5.getText());
                load.writeFiles(lunchForWeak,FileForLunch);
                JOptionPane.showMessageDialog(lunchMeal,"food pick for day "+l);

            }
        });

        bl6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lunchForWeak.put(l, ml6.getText());
                load.writeFiles(lunchForWeak,FileForLunch);
                JOptionPane.showMessageDialog(lunchMeal,"food pick for day "+l);

            }
        });

        bl7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lunchForWeak.put(l, ml7.getText());
                load.writeFiles(lunchForWeak,FileForLunch);
                JOptionPane.showMessageDialog(lunchMeal,"food pick for day "+l);

            }
        });

        bl8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lunchForWeak.put(l, ml1.getText());
                load.writeFiles(lunchForWeak,FileForLunch);
                JOptionPane.showMessageDialog(lunchMeal,"food pick for day "+l);

            }
        });
        lBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lunchMeal.setVisible(false);
                whichDay.setVisible(true);
            }
        });
        lBackM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lunchMeal.setVisible(false);
                Admin ad = new Admin("");
                ad.packAdmin();
            }
        });
        lBackM.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
     }

     public void packLunch(){
         makeItemForLunch();
         lmPanel.setBackground(Color.white);
         lunchMeal.getContentPane().add(lmPanel);
         lunchMeal.setJMenuBar(MLMenuBar);
         lunchMeal.setVisible(true);
     }

    private void makeItemForDinner(){
        dinnerMeal.setSize(270,350);
        dmPanel.setLayout(null);
        questionD.setEditable(false);
        questionD.setBounds(5,5,80,20);
        dmPanel.add(questionD);
        md1.setBounds(20,30,110,20);
        dmPanel.add(md1);
        bd1.setBounds(100,30,110,25);
        bd1.setBackground(Color.CYAN);
        dmPanel.add(bd1);
        md2.setBounds(20,60,110,20);
        dmPanel.add(md2);
        bd2.setBounds(100,60,110,25);
        bd2.setBackground(Color.CYAN);
        dmPanel.add(bd2);
        md3.setBounds(20,90,110,20);
        dmPanel.add(md3);
        bd3.setBounds(100,90,110,25);
        bd3.setBackground(Color.CYAN);
        dmPanel.add(bd3);
        md4.setBounds(20,120,110,20);
        dmPanel.add(md4);
        bd4.setBounds(100,120,110,25);
        bd4.setBackground(Color.CYAN);
        dmPanel.add(bd4);
        md5.setBounds(20,150,110,20);
        dmPanel.add(md5);
        bd5.setBounds(100,150,110,25);
        bd5.setBackground(Color.CYAN);
        dmPanel.add(bd5);
        md6.setBounds(20,180,110,20);
        dmPanel.add(md6);
        bd6.setBounds(100,180,110,25);
        bd6.setBackground(Color.CYAN);
        dmPanel.add(bd6);
        md7.setBounds(20,210,110,20);
        dmPanel.add(md7);
        bd7.setBounds(100,210,110,25);
        bd7.setBackground(Color.CYAN);
        dmPanel.add(bd7);
        md8.setBounds(20,240,110,20);
        dmPanel.add(md8);
        bd8.setBounds(100,240,110,25);
        bd8.setBackground(Color.CYAN);
        dmPanel.add(bd8);
        MDMenu.add(dmBack);
        MDMenu.add(dmBackM);
        MDMenuBar.add(MDMenu);
        bd1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dinnerForWeak.put(d, md1.getText());
                load.writeFiles(dinnerForWeak,FileForDinner);
                JOptionPane.showMessageDialog(dinnerMeal,"food pick for day "+d);
            }
        });
        bd2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dinnerForWeak.put(d, md2.getText());
                load.writeFiles(dinnerForWeak,FileForDinner);
                JOptionPane.showMessageDialog(dinnerMeal,"food pick for day "+d);
            }
        });
        bd3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dinnerForWeak.put(d, md3.getText());
                load.writeFiles(dinnerForWeak,FileForDinner);
                JOptionPane.showMessageDialog(dinnerMeal,"food pick for day "+d);
            }
        });
        bd4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dinnerForWeak.put(d, md4.getText());
                load.writeFiles(dinnerForWeak,FileForDinner);
                JOptionPane.showMessageDialog(dinnerMeal,"food pick for day "+d);
            }
        });
        bd5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dinnerForWeak.put(d, md5.getText());
                load.writeFiles(dinnerForWeak,FileForDinner);
                JOptionPane.showMessageDialog(dinnerMeal,"food pick for day "+d);
            }
        });
        bd6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dinnerForWeak.put(d, md6.getText());
                load.writeFiles(dinnerForWeak,FileForDinner);
                JOptionPane.showMessageDialog(dinnerMeal,"food pick for day "+d);
            }
        });
        bd7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dinnerForWeak.put(d, md7.getText());
                load.writeFiles(dinnerForWeak,FileForDinner);
                JOptionPane.showMessageDialog(dinnerMeal,"food pick for day "+d);
            }
        });
        bd8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dinnerForWeak.put(d, md8.getText());
                load.writeFiles(dinnerForWeak,FileForDinner);
                JOptionPane.showMessageDialog(dinnerMeal,"food pick for day "+d);
            }
        });
        dmBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dinnerMeal.setVisible(false);
                whichDay.setVisible(true);
            }
        });
        dmBackM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dinnerMeal.setVisible(false);
                Admin ad = new Admin("");
                ad.packAdmin();
            }
        });
        dmBackM.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.ALT_MASK));
    }

    public void packDinner(){
        makeItemForDinner();
        dmPanel.setBackground(Color.white);
        dinnerMeal.getContentPane().add(dmPanel);
        dinnerMeal.setJMenuBar(MDMenuBar);
        dinnerMeal.setVisible(true);
    }

}

