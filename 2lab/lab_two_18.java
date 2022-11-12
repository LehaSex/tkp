import java.util.*;
public class lab_two_18 {
    /*
     * В массиве целых чисел найти наиболее часто встречающееся число. Если таких чисел несколько, то определить наименьшее из них.
     */
    public static void main(String[] args) {

/*         // Заполнение массива
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        } */

        // Заполнение массива с клавиатуры
        int[] array = new int[10];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + (i + 1) + " элемент массива: ");
            array[i] = in.nextInt();
        }

        // Вывод массива
        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Подсчёт количества вхождений каждого числа
        int[] count = new int[10];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }

        // Поиск наиболее часто встречающегося числа
        int max = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > count[max]) {
                max = i;
            }
        }

        // Вывод результата
        System.out.println();
        System.out.println("Наиболее часто встречающееся число: " + max);
        in.close();
    }
}
