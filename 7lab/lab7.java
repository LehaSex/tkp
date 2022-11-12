import java.awt.*;
import javax.swing.*;

class Calculator {

    public static void setTextArea(JFrame fr) {
        JPanel myPanel2 = new JPanel();
        myPanel2.setLayout(new BorderLayout());
        JTextArea myTextArea = new JTextArea(15, 20);
        myTextArea.setLineWrap(true);
        myTextArea.setWrapStyleWord(true);

        // add placeholder text
        myTextArea.setText("TextArea");

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
        JButton myButton5 = new JButton("Кнопка 2");
        myButton5.setPreferredSize(new Dimension(100, 30));
        myPanel3.add(myButton5);
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