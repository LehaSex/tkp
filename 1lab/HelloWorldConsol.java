// подключение библиотеки java.util
import java.util.*;
public class HelloWorldConsol {
    public static void main(String[] args) {
        // объявление переменных 
        String name;
        int age;

        // создание объекта класса Scanner с кодировкой Cp866 для чтения ввода с консоли
        Scanner sc = new Scanner(System.in, "Cp866");
        // вывод сообщения
        System.out.println("Как Вас зовут? ");
        // считывание ввода с консоли
        name = sc.nextLine();
        // вывод сообщения с введенным именем
        System.out.println("Привет, " + name + "!");
        System.out.println("Сколько Вам лет? ");
        age = sc.nextInt();
        System.out.println(name + ", вам " + age + " лет!");
        // закрытие объекта класса Scanner для предотвращения утечки памяти
        sc.close();
    }
}