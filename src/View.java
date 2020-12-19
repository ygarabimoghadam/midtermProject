import sun.rmi.runtime.Log;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;


public class View {
    private JFrame view ;
    private JPanel panel ;
    private JTabbedPane tabbedPane ;
    private JList<File> directoryList;
    //private static final String NOTES_PATH = "C:\\Users\\Admin\\Desktop\\midtermProject\\myFiles\\students";
    private File[] files ;
    private LogOutAdmin load = new LogOutAdmin();
    private JMenuBar menuBar ;
    private JMenu jmenu ;
    private JMenuItem back;
    Color c = new Color(192,0,255);

    public View(){
        view = new JFrame("Portal");
        panel = new JPanel();
        tabbedPane = new JTabbedPane();
        menuBar = new JMenuBar();
        jmenu = new JMenu("File");
        back = new JMenuItem("back");


    }

    public void makeItems(String name){
        files = new File(name).listFiles() ;
        directoryList = new JList<>(files);
        panel.setLayout(new BorderLayout());
        panel.add(tabbedPane, BorderLayout.CENTER);
        directoryList.setBackground(new Color(211, 211, 211));
        directoryList.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        directoryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        directoryList.setVisibleRowCount(-1);
        directoryList.setMinimumSize(new Dimension(130, 100));
        directoryList.setMaximumSize(new Dimension(130, 100));
        directoryList.setFixedCellWidth(130);
        directoryList.setCellRenderer(new MyCellRenderer());
        directoryList.addMouseListener(new MyMouseAdapter());
        panel.add(new JScrollPane(directoryList), BorderLayout.WEST);
        jmenu.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setVisible(false);
                Admin ad = new Admin("");
                ad.packAdmin();
            }
        });
        menuBar.add(jmenu);
        view.setJMenuBar(menuBar);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBackground(c);
        view.add(panel);
        view.setSize(400,400);
        view.setVisible(true);
    }

    public void openExistingNote(String content) {
        JTextArea existPanel = createTextPanel();
        existPanel.setText(content);

        int tabIndex = tabbedPane.getTabCount() + 1;
        tabbedPane.addTab("Tab " + tabIndex, existPanel);
        tabbedPane.setSelectedIndex(tabIndex - 1);
    }

    private JTextArea createTextPanel() {
        JTextArea textPanel = new JTextArea();
        textPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        return textPanel;
    }

    private class MyMouseAdapter extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent eve) {
            // Double-click detected
            if (eve.getClickCount() == 2) {
                int index = directoryList.locationToIndex(eve.getPoint());
                System.out.println("Item " + index + " is clicked...");
                //TODO: Phase1: Click on file is handled... Just load content into JTextArea
                // done
                File curr[] = files;
                String content = null;
                try {
                    File c = curr[index];
                    String name = c.getName();



                        content = load.fileReaderInput(curr[index]);
                    System.out.println(curr[index]);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                openExistingNote(content);
            }
        }
    }

    private class MyCellRenderer extends DefaultListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList list, Object object, int index, boolean isSelected, boolean cellHasFocus) {
            if (object instanceof File) {
                File file = (File) object;
                setText(file.getName());
                setIcon(FileSystemView.getFileSystemView().getSystemIcon(file));
                if (isSelected) {
                    setBackground(list.getSelectionBackground());
                    setForeground(list.getSelectionForeground());
                } else {
                    setBackground(list.getBackground());
                    setForeground(list.getForeground());
                }
                setEnabled(list.isEnabled());
            }
            return this;
        }
    }
}
