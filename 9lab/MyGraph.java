import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyGraph extends JFrame implements ActionListener {
    private JMyPanel myPanel = new JMyPanel();

    public static void main(String[] args) {
        new MyGraph("Окно с графикой");
    }

    public MyGraph(String s) {
        super(s);
        JMenuBar menuBar = new JMenuBar();
        JMenu drawMenu = new JMenu("Действие");
        JMenu clearMenu = new JMenu("Очистить");
        JMenuItem[] figs = new JMenuItem[5];
        for (int i = 4; i >= 0; i--) {
            figs[i] = new JMenuItem(JMyPanel.Figure.values()[i].toString());
            figs[i].addActionListener(this);
            if(i != 4)
                drawMenu.add(figs[i]);
            else
                clearMenu.add(figs[i]);
        }
        menuBar.add(drawMenu);
        menuBar.add(clearMenu);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(menuBar, BorderLayout.NORTH);
        add(myPanel, BorderLayout.CENTER);
        Dimension size = getSize();
        size.setSize(size.width, size.height + 200);
        setSize(400, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        myPanel.ris(e.getActionCommand());
    }
}