import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.HashMap;

public class MealForStudent {
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
    boolean lunchH;
    boolean dinnerR;
    private String l;
    private String d;
    private JFrame lunchMeal;
    private JPanel lMeal;
    private JLabel id;
    private JTextField idd;
    private JTextArea food;
    private JTextArea price;
    private JButton choose;
    private JButton lBack;
    private HashMap<String,String> setMeal = new HashMap<>();
    private HashMap<String,String> charges = new HashMap<>();
    private LogOutAdmin logo = new LogOutAdmin();
    private JFrame dinnerMeal;
    private JPanel dMeal;
    private JLabel did;
    private JTextField didd;
    private JTextArea dfood;
    private JTextArea dprice;
    private JButton dchoose;
    private JButton ddBack;

    public MealForStudent(){
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
            lunchMeal = new JFrame();
            lMeal = new JPanel();
            id = new JLabel("ID: ");
            idd = new JTextField(20);
            food = new JTextArea("");
            price = new JTextArea("");
            choose = new JButton("Choose");
            lBack = new JButton("back");
            dinnerMeal = new JFrame();
            dMeal = new JPanel();
            did = new JLabel("ID: ");
            didd = new JTextField(20);
            dfood = new JTextArea("");
            dprice = new JTextArea("");
            dchoose = new JButton("Choose");
            ddBack = new JButton("back");
    }
    private void makeItemForMeal(){

        whichMeal.setSize(250,150);
        whmPanel.setLayout(null);
        lunch.setBounds(5,5,100,25);
        whmPanel.add(lunch);
        lButton.setBounds(70,5,80,25);
        lButton.setBackground(Color.PINK);
        whmPanel.add(lButton);
        dinner.setBounds(5,50,100,25);
        whmPanel.add(dinner);
        DButton.setBounds(70,50,80,25);
        DButton.setBackground(Color.pink);
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
                Student s = new Student("");
                s.packStudent();
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
        question.setBackground(Color.pink);
        question.setEditable(false);
        whdPanel.add(question);
        day1.setBounds(20,30,100,25);
        whdPanel.add(day1);
        d1.setBounds(100,30,100,25);
        d1.setBackground(Color.pink);
        whdPanel.add(d1);
        day2.setBounds(20,60,100,25);
        whdPanel.add(day2);
        d2.setBounds(100,60,100,25);
        d2.setBackground(Color.pink);
        whdPanel.add(d2);
        day3.setBounds(20,90,100,25);
        whdPanel.add(day3);
        d3.setBounds(100,90,100,25);
        d3.setBackground(Color.pink);
        whdPanel.add(d3);
        day4.setBounds(20,120,100,25);
        whdPanel.add(day4);
        d4.setBounds(100,120,100,25);
        d4.setBackground(Color.pink);
        whdPanel.add(d4);
        day5.setBounds(20,150,100,25);
        whdPanel.add(day5);
        d5.setBounds(100,150,100,25);
        d5.setBackground(Color.pink);
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
    private int priceOfFood(){
        int price = 0 ;
        String filename = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\Lunch.txt";
        setMeal = logo.readFiles(filename);
        if(setMeal.get(l).equals("pizza")){
            price = 2000;
        }
        if(setMeal.get(l).equals("hamburger")){
            price = 3000;
        }
        if(setMeal.get(l).equals("sandwich")){
            price = 1000;
        }
        if(setMeal.get(l).equals("ghorme sabzi")){
            price = 4000;
        }
        if(setMeal.get(l).equals("gheyme")){
            price = 4000;
        }
        if(setMeal.get(l).equals("abgusht")){
            price = 5000;
        }
        if(setMeal.get(l).equals("juje")){
            price = 3000;
        }
        if(setMeal.get(l).equals("kabab")){
            price = 5000;
        }
        return  price;
    }

    private void makeItemForLunch(){
        String filename = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\Lunch.txt";
        setMeal = logo.readFiles(filename);
        String fileN = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\charge.txt";
        charges = logo.readFiles(fileN);
        lunchMeal.setSize(250,150);
        lMeal.setLayout(null);
        id.setBounds(5,5,50,25);
        lMeal.add(id);
        idd.setBounds(50,5,150,25);
        id.setLabelFor(idd);
        lMeal.add(idd);
        food.setEditable(false);
        food.setBounds(5,40,80,25);
        food.setText(setMeal.get(l));
        //food.setText("hi");
        food.setBackground(Color.PINK);
        lMeal.add(food);
        price.setBounds(100,40,80,25);
        price.setBackground(Color.MAGENTA);
        int p = priceOfFood();
        String pp = Integer.toString(p);
        price.setText(pp);
        //price.setText("bye");
        lMeal.add(price);
        choose.setBounds(5,80,100,25);
        choose.setBackground(Color.BLACK);
        lMeal.add(choose);
        back.setBackground(Color.BLACK);
        back.setBounds(120,80,100,25);
        lMeal.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lunchMeal.setVisible(false);
                whichDay.setVisible(true);
            }
        });
        choose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n =idd.getText();
               String mujudi = charges.get(n);
                int m = Integer.parseInt(mujudi);
                int p = priceOfFood();
                if(m>=p){
                    int jadid = m -p;
                    String mu = Integer.toString(jadid);
                    charges.put(n,mu);
                    logo.writeFiles(charges,fileN);
                }
                else{
                    JOptionPane.showMessageDialog(lunchMeal, "your money is low");
                }
            }
        });
    }

    public void packLunch(){
        makeItemForLunch();
        lMeal.setBackground(Color.white);
        lunchMeal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lunchMeal.add(lMeal);
        lunchMeal.setVisible(true);
    }

    private int priceOfFoodD(){
        int price = 0 ;
        String filename = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\Dinner.txt";
        setMeal = logo.readFiles(filename);
        if(setMeal.get(d).equals("pizza")){
            price = 2000;
        }
        if(setMeal.get(d).equals("hamburger")){
            price = 3000;
        }
        if(setMeal.get(d).equals("sandwich")){
            price = 1000;
        }
        if(setMeal.get(d).equals("ghorme sabzi")){
            price = 4000;
        }
        if(setMeal.get(d).equals("gheyme")){
            price = 4000;
        }
        if(setMeal.get(d).equals("abgusht")){
            price = 5000;
        }
        if(setMeal.get(d).equals("juje")){
            price = 3000;
        }
        if(setMeal.get(d).equals("kabab")){
            price = 5000;
        }
        return  price;
    }

    private void makeItemForDinner(){
        String filename = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\Dinner.txt";
        setMeal = logo.readFiles(filename);
        String fileN = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\charge.txt";
        charges = logo.readFiles(fileN);
        dinnerMeal.setSize(250,150);
        dMeal.setLayout(null);
        did.setBounds(5,5,50,25);
        dMeal.add(did);
        didd.setBounds(50,5,150,25);
        did.setLabelFor(didd);
        dMeal.add(didd);
        dfood.setEditable(false);
        dfood.setBounds(5,40,80,25);
        dfood.setText(setMeal.get(d));
       // dfood.setText("hi");
        dfood.setBackground(Color.PINK);
        dMeal.add(food);
        dprice.setBounds(100,40,80,25);
        dprice.setBackground(Color.MAGENTA);
        int p = priceOfFoodD();
        String pp = Integer.toString(p);
        dprice.setText(pp);
        //price.setText("bye");
        dMeal.add(dprice);
        dchoose.setBounds(5,80,100,25);
        dchoose.setBackground(Color.BLACK);
        dMeal.add(dchoose);
        ddBack.setBackground(Color.BLACK);
        ddBack.setBounds(120,80,100,25);
        dMeal.add(ddBack);
        ddBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dinnerMeal.setVisible(false);
                whichDay.setVisible(true);
            }
        });
        dchoose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n =idd.getText();
                String mujudi = charges.get(n);
                int m = Integer.parseInt(mujudi);
                int p = priceOfFoodD();
                if(m>=p){
                    int jadid = m -p;
                    String mu = Integer.toString(jadid);
                    charges.put(n,mu);
                    logo.writeFiles(charges,fileN);
                }
                else{
                    JOptionPane.showMessageDialog(dinnerMeal, "your money is low");
                }
            }
        });
    }

    public void packDinner(){
        makeItemForDinner();
        dMeal.setBackground(Color.white);
        dinnerMeal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dinnerMeal.add(dMeal);
        dinnerMeal.setVisible(true);
    }
}

