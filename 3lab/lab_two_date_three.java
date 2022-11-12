// подключение библиотеки java.util
import java.text.SimpleDateFormat;
import java.util.*;
public class lab_two_date_three {

    public static void main(String[] args) {


        // Текущая дата:
        Date start = new Date();
        System.out.println("Начало выполнения до форматирования: "+start);
        // Формат даты Год Месяц День
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        System.out.println("Начало выполнения после форматирования: "+sdf.format(start));
        
    }
}