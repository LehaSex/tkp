// подключение библиотеки java.util
import java.util.*;
class lab_two_text {

    private String text;
    private char symb;

    public lab_two_text(String text, char symb) {
        this.text = text;
        this.symb = symb;
    }

    // конструктор по умолчанию

    public lab_two_text() {
        this.text = "Hello world";
        this.symb = 'l';
    }

    // конструктор класса

    public void revert()
    {
        // создание объекта класса StringBuilder
        StringBuilder sb = new StringBuilder(this.text);
        // вывод на экран перевернутого текста
        System.out.println(sb.reverse());
    }

    // метод подсчёта количества символа в тексте
    public void count()
    {
        // создание объекта класса StringBuilder
        StringBuilder sb = new StringBuilder(this.text);
        // создание переменной для подсчёта количества символов
        int count = 0;
        // цикл по всем символам текста
        for (int i = 0; i < sb.length(); i++)
        {
            // если символ совпадает с искомым в верхнем или нижнем регистре, то увеличиваем счётчик
            if (sb.charAt(i) == Character.toLowerCase(this.symb) || sb.charAt(i) == Character.toUpperCase(this.symb))
                count++;
        }
        // возвращаем количество символов
        System.out.println("Количество символов " + this.symb + " в тексте: " + count);
    }
    // метод переносящий слова на новую строку
    public void newLine()
    {
        // замена нескольких пробелов на один перенос строки с помощью регулярного выражения
        System.out.println("Слова с новой строки: ");
        System.out.println(this.text.replaceAll("\\s+", "\n"));
    }

    // get set
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public char getSymb() {
        return this.symb;
    }

    public void setSymb(char symb) {
        this.symb = symb;
    }
}

class lab_two_text_main {
    public static void main(String[] args) {

        // объявление переменных 
        String txt;
        char symb;

        // создание объекта класса Scanner с кодировкой Cp866 для чтения ввода с консоли
        Scanner sc = new Scanner(System.in, "Cp866");

        // вывод сообщения
        System.out.println("Введите текст: ");
        // считывание ввода с консоли
        txt = sc.nextLine();

        System.out.println("Введите искомый символ: ");
        // считывание ввода с консоли
        symb = sc.next().charAt(0);

        // создание объекта класса lab_two_text
        lab_two_text obj = new lab_two_text(txt, symb);

        System.out.println("*******Задание 1*******");
        obj.revert();

        System.out.println("*******Задание 2*******");
        obj.count();

        System.out.println("*******Задание 3*******");
        obj.newLine();

        obj = new lab_two_text();

        System.out.println("*******Задание 1*******");
        obj.revert();

        System.out.println("*******Задание 2*******");
        obj.count();

        System.out.println("*******Задание 3*******");
        obj.newLine();

        // закрытие объекта класса Scanner для предотвращения утечки памяти
        sc.close();
    }
}