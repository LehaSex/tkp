// подключение библиотеки java.util
import java.util.*;
public class lab_two_date_one {

    public static void main(String[] args) {


        // Текущая дата:
        Date start = new Date();
        System.out.println("Начало выполнения: "+start);
        long time;
        // Добавляем миллион секунд к текущей дате:
        time = start.getTime() + 1000000000;
        Date t = new Date(time);
        System.out.println("Дата через миллион секунд: " +t);
        // Время (почти) завершения программы:
        Date finish=new Date();
        System.out.println("Завершение выполнения: "+finish);
        // Длительность выполнения программы:
        System.out.println("Прошло "+(finish.getTime()-start.getTime()) +" миллисекунд");
        
    }
}