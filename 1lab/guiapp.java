// подключение графической библиотеки swing
import javax.swing.*;
public class guiapp {
    public static void main(String[] args) {
        // объявление переменных
        String name;
        // создание объекта класса JOptionPane для вывода диалогового окна
        JOptionPane.showMessageDialog(null, "Всем большой привет!");
        // считывание ввода с диалогового окна
        name=JOptionPane.showInputDialog("Привет, как Вас зовут?");
        // вывод сообщения с введенным именем
        JOptionPane.showMessageDialog(null, "Приятно познакомиться, \n"+name+"!");
        }
}
