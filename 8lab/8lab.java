import java.awt.*;
import javax.swing.*;

class TextAreaa {


}

class Calculator {
    
    static JTextArea myTextArea;

    public static void setTextArea(JFrame fr) {
        String text = "TextArea";
        JPanel myPanel2 = new JPanel();
        myPanel2.setLayout(new BorderLayout());
        myTextArea = new JTextArea(13, 20);
        myTextArea.setFont(new Font("Arial", Font.PLAIN, 15));
        myTextArea.setLineWrap(true);
        myTextArea.setWrapStyleWord(true);

        // add placeholder text
        myTextArea.setText(text);

        JScrollPane myScrollPane = new JScrollPane(myTextArea);
        myPanel2.add(myScrollPane, BorderLayout.NORTH);
        fr.add(myPanel2, BorderLayout.NORTH);
    }

    public static void setButtons(JFrame fr) {
        JPanel myPanel3 = new JPanel();
        myPanel3.setLayout(new FlowLayout());
        JButton myButton3 = new JButton("Кнопка 1");
        myButton3.setPreferredSize(new Dimension(100, 30));
        myPanel3.add(myButton3);
        JButton myButton4 = new JButton("Меню");
        myButton4.setPreferredSize(new Dimension(80, 30));
        myPanel3.add(myButton4);
        JButton myButton5 = new JButton("Очистить");
        myButton5.setPreferredSize(new Dimension(100, 30));
        myPanel3.add(myButton5);
        // add listeners
        myButton3.addActionListener(e -> {
            // dialog 
            JOptionPane.showMessageDialog(fr, "Кнопка 1");
        });
        myButton4.addActionListener(e -> {
            // display menu
            JPopupMenu popupMenu = new JPopupMenu();
            JMenuItem menuItem1 = new JMenuItem("Меню 1");
            JMenuItem menuItem2 = new JMenuItem("Меню 2");
            JMenuItem menuItem3 = new JMenuItem("Меню 3");
            popupMenu.add(menuItem1);
            popupMenu.add(menuItem2);
            popupMenu.add(menuItem3);
            popupMenu.show(myButton4, 0, 0);
        });
        myButton5.addActionListener(e -> {
            // clear text area
            myTextArea.setText("");
        });
        // at the bottom of text area
        fr.add(myPanel3, BorderLayout.CENTER);
    }

    public static void setGrid(JFrame fr) {

        // array with button text

        String[] buttons = { "1", "2 ABC", "3 DEF", "4 GHI", "5 JKL", "6 MNO", "7 PQRS", "8 TUV", "9 WXYZ", "*", "0", "#" };

        JPanel myPanel4 = new JPanel();
        myPanel4.setLayout(new GridLayout(4, 3));

        for (int i = 0; i < buttons.length; i++) {
            JButton myButton = new JButton(buttons[i]);
            myButton.setPreferredSize(new Dimension(50, 80));
            myButton.setFont(new Font("Arial", Font.PLAIN, 20));
            myPanel4.add(myButton);
            // add listeners
            myButton.addActionListener(e -> {
                // add text to text area
                myTextArea.setText(myTextArea.getText() + myButton.getText().charAt(0) + "");
            });
        }
        fr.add(myPanel4, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lab7");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(195 * 2, 315 * 2);
        // fix size
        frame.setResizable(false);

        setTextArea(frame);
        setButtons(frame);
        setGrid(frame);
        frame.setVisible(true);
    }

}