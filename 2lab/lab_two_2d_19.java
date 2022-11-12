import java.util.*;
public class lab_two_2d_19 {
    /*
     * Дан двумерный массив. Выяснить, есть ли строки с одинаковой суммой элементов. Если есть, вывести их номера.
     */
    public static void main(String[] args) {

        // Заполнение массива
        System.out.println("Введите числа массива: ");
        int[][] array = new int[5][5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) in.nextInt();
            }
        }

        // Вывод массива
        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Поиск строк с одинаковой суммой элементов
        int[] row = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                row[i] += array[i][j];
            }
        }

        // Вывод результата
        System.out.println();
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < row.length; j++) {
                if (row[i] == row[j] && i != j) {
                    System.out.println("Строки " + i + " и " + j + " имеют одинаковую сумму элементов");
                }
            }
        }

        in.close();
    }
    
}
