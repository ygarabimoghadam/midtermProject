import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.err;

public class Main extends Component {

    public void changeLookAndFeel() {

        List<String> lookAndFeelsDisplay = new ArrayList<>();
        List<String> lookAndFeelsRealNames = new ArrayList<>();

        for (UIManager.LookAndFeelInfo each : UIManager.getInstalledLookAndFeels()) {
            lookAndFeelsDisplay.add(each.getName());
            lookAndFeelsRealNames.add(each.getClassName());
        }

        String changeLook = (String) JOptionPane.showInputDialog(this, "Choose Look and Feel Here:", "Select Look and Feel", JOptionPane.QUESTION_MESSAGE, null, lookAndFeelsDisplay.toArray(), null);

        if (changeLook != null) {
            for (int i = 0; i < lookAndFeelsDisplay.size(); i++) {
                if (changeLook.equals(lookAndFeelsDisplay.get(i))) {
                    try {
                        UIManager.setLookAndFeel(lookAndFeelsRealNames.get(i));
                        break;
                    }
                    catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                        err.println(ex);
                        ex.printStackTrace(err);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
       // m.changeLookAndFeel();
        choiceOfType choice = new choiceOfType();
       // choice.makeItems();
        Meal me = new Meal();
        me.packDinner();
    }
}
