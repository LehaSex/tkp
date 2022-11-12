// подключение библиотеки java.util
import java.util.*;
public class lab_two_date_two {

    public static Date randomDate(int startYear, int endYear) {
        // Генерация случайной даты в заданном диапазоне
        Calendar calendar = Calendar.getInstance();
        int year = randBetween(startYear, endYear);
        calendar.set(Calendar.YEAR, year);
        int dayOfYear = randBetween(1, calendar.getActualMaximum(Calendar.DAY_OF_YEAR));
        calendar.set(Calendar.DAY_OF_YEAR, dayOfYear);
        return calendar.getTime();
    }
    
    private static int randBetween(int low, int high) {
        // Случайное число в диапазоне от low до high
        Random r = new Random();
        return r.nextInt(high-low) + low;
    }

    public static void main(String[] args) {
        int start;
        int end;
        Scanner sc = new Scanner(System.in, "Cp866");
        // вывод сообщения
        System.out.println("Введите начальный год: ");
        // считывание ввода с консоли
        start = sc.nextInt();
        // вывод сообщения
        System.out.println("Введите конечный год: ");
        // считывание ввода с консоли
        end = sc.nextInt();

        System.out.println(randomDate(start, end));

        sc.close();
        
    }
}