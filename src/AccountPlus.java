import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class AccountPlus {
    private JFrame charge;
    private JPanel chargePanel;
    private JLabel id ;
    private JTextField idd;
    private JLabel price;
    private JLabel numberOfCart;
    private JTextField priceOf;
    private JTextField  number;
    private JButton charging;
    private LogOutAdmin logo = new LogOutAdmin();
    private HashMap<String ,String> charges = new HashMap<>();

    public AccountPlus(){
        charge = new JFrame("Charge section");
        chargePanel = new JPanel();
        price = new JLabel("how much?");
        numberOfCart = new JLabel("Cart ID:");
        priceOf = new JTextField(20);
        number = new JTextField(20);
        charging = new JButton("Charge");
        id = new JLabel("ID:");
        idd = new JTextField(20);
    }

    private void makeItems(){
        charge.setSize(270,150);
        chargePanel.setLayout(null);
        id.setBounds(5,5,80,25);
        chargePanel.add(id);
        idd.setBounds(100,5,150,25);
        id.setLabelFor(idd);
        chargePanel.add(idd);
        price.setBounds(5,40,80,25);
        chargePanel.add(price);
        priceOf.setBounds(100,40,150,25);
        price.setLabelFor(priceOf);
        chargePanel.add(priceOf);
        numberOfCart.setBounds(5,80,80,25);
        chargePanel.add(numberOfCart);
        number.setBounds(100,80,150,25);
        numberOfCart.setLabelFor(number);
        chargePanel.add(number);
        charging.setBounds(5,120,100,25);

        charging.setBackground(new Color(250,0,210));
        chargePanel.add(charging);
    }

    public void packCharge(){
        makeItems();
        actionButton();
        chargePanel.setBackground(new Color(211,211,211));
        charge.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        charge.getContentPane().add(chargePanel);
        charge.setVisible(true);
    }

    private void actionButton() {
        charging.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fileNAme = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\charge.txt";
                charges = logo.readFiles(fileNAme);
                String p = priceOf.getText();
                String num = number.getText();
                String id = idd.getText();
                if(num.equals("")||p.equals("")|| id.equals("")){
                    JOptionPane.showMessageDialog(charge, "please enter probably");
                }
                else{
                    if(charges.containsKey(id)){
                        JOptionPane.showMessageDialog(charge, "done");
                        String price = charges.get(id);
                        int pri = Integer.parseInt(price);
                        int newPrice = Integer.parseInt(p);
                        int newP = newPrice+pri;
                        String myPrice = Integer.toString(newP);
                        charges.put(id,myPrice);
                        logo.writeFiles(charges,fileNAme);
                        charge.setVisible(false);
                        Student s = new Student("");
                        s.packStudent();
                    }
                    else{
                        JOptionPane.showMessageDialog(charge, "this username is wrong");
                        idd.setText("");
                    }
                }
            }
        });
    }
}
