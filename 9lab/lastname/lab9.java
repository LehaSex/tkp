import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class LastNameWindow extends JFrame {
    public LastNameWindow (String title)
    {
        super(title);
        
        setSize(1150, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        JMenuBar menuBar = new JMenuBar();
/*         JMenu colorMenu = new JMenu("Выбрать цвет"); */
        JMenu clearMenu = new JMenu("Очистить");
/*         menuBar.add(colorMenu); */
        menuBar.add(clearMenu);
/*         // on click colorMenu open colorpicker
        colorMenu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Color color = JColorChooser.showDialog(null, "Выберите цвет", Color.BLACK);
                // set bg color
                getContentPane().setBackground(color);
            }
        }); */

        // on click clearMenu clear window
        clearMenu.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getContentPane().removeAll();
                getContentPane().repaint();
            }
        });
        add(menuBar, BorderLayout.NORTH);
        // draw last name
        add(new LastNamePanel());
        
        setVisible(true);
    }

}

class LastNamePanel extends JPanel {
    public void paintComponent(Graphics g) {
        
        super.paintComponent(g);
        BasicStroke pen;
        // letter P
        g.setColor(Color.PINK);
        g.fillRect(50, 50, 25, 100);
        // draw filled arc
        g.fillArc(25, 50, 100, 75, 90, -180);
        g.setColor(Color.WHITE);
        g.fillArc(40, 60, 75, 50, 90, -180);
        // letter E
        g.setColor(Color.BLUE);
        g.fillRect(150, 50, 25, 100);
        g.fillRect(150, 50, 75, 25);
        g.fillRect(150, 100, 75, 25);
        g.fillRect(150, 150, 75, 25);
        // letter Ш
        g.setColor(Color.RED);
        g.fillRect(250, 50, 25, 100);
        g.setColor(Color.GREEN);
        g.fillRect(300, 50, 25, 100);
        g.setColor(Color.ORANGE);
        g.fillRect(350, 50, 25, 100);
        g.setColor(Color.YELLOW);
        g.fillRect(250, 150, 125, 25);
        // letter E
        pen = new BasicStroke(20, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        ((Graphics2D) g).setStroke(pen);
        // gradient green to orange
        GradientPaint gradient = new GradientPaint(450, 50, Color.GREEN, 450, 150, Color.ORANGE);
        ((Graphics2D) g).setPaint(gradient);
        g.drawLine(400, 50, 400, 150);
        g.setColor(Color.RED);
        g.drawLine(400, 50, 475, 50);
        g.setColor(Color.GREEN);
        g.drawLine(400, 100, 475, 100);
        // gradient orange to red
        gradient = new GradientPaint(450, 50, Color.BLACK, 450, 150, Color.RED);
        ((Graphics2D) g).setPaint(gradient);
        g.drawLine(400, 150, 475, 150);
        //letter T gradient purple to pink
        gradient = new GradientPaint(500, 50, Color.PINK, 500, 150, Color.MAGENTA);
        ((Graphics2D) g).setPaint(gradient);
        pen = new BasicStroke(10, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND);
        ((Graphics2D) g).setStroke(pen);
        g.drawLine(500, 50, 575, 50);
        g.drawLine(537, 50, 537, 150);
        // letter H
        //stroke
        //gradient red to yellow
        gradient = new GradientPaint(600, 50, Color.RED, 600, 150, Color.YELLOW);
        ((Graphics2D) g).setPaint(gradient);
        pen = new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        ((Graphics2D) g).setStroke(pen);
        g.drawLine(600, 50, 600, 150);
        g.drawLine(650, 50, 650, 150);
        g.drawLine(600, 100, 650, 100);
        // letter И
        // gradient blue to green
        gradient = new GradientPaint(700, 50, Color.BLUE, 700, 150, Color.GREEN);
        ((Graphics2D) g).setPaint(gradient);
        pen = new BasicStroke(17, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        ((Graphics2D) g).setStroke(pen);
        g.drawLine(700, 50, 700, 150);
        g.drawLine(700, 150, 750, 50);
        g.drawLine(750, 50, 750, 150);
        // letter К
        // gradient yellow to red
        gradient = new GradientPaint(800, 50, Color.YELLOW, 800, 150, Color.RED);
        ((Graphics2D) g).setPaint(gradient);
        pen = new BasicStroke(17, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        ((Graphics2D) g).setStroke(pen);
        g.drawLine(800, 50, 800, 150);
        g.drawLine(800, 100, 850, 50);
        g.drawLine(800, 100, 850, 150);
        // letter O
        // gradient red to blue
        gradient = new GradientPaint(900, 50, Color.RED, 900, 150, Color.BLUE);
        ((Graphics2D) g).setPaint(gradient);
        pen = new BasicStroke(17, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        ((Graphics2D) g).setStroke(pen);
        g.drawOval(900, 50, 100, 100);
        // letter B
        // gradient purple to brown
        gradient = new GradientPaint(1000, 50, Color.MAGENTA, 1000, 150, Color.ORANGE);
        ((Graphics2D) g).setPaint(gradient);
        pen = new BasicStroke(17, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        ((Graphics2D) g).setStroke(pen);

        g.drawLine(1050, 50, 1050, 150);
        g.fillArc(1000, 45, 100, 75, 90, -180);
        g.fillArc(990, 85, 125, 90, 90, -180);
        // set white color 
        g.setColor(Color.WHITE);
        g.fillArc(1005, 95, 105, 60, 90, -180);
        g.fillArc(1025, 55, 60, 30, 90, -180);
    }
}

public class lab9 {
    public static void main(String[] args) {
        new LastNameWindow("Фамилия");
    }
}
