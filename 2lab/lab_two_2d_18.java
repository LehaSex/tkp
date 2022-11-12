import java.util.*;
public class lab_two_2d_18 {
    /*
     * Дан двумерный массив. Выяснить, есть ли столбец и строка с одинаковым произведением элементов. Если есть, напечатать их номера.
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

        // Поиск столбца и строки с одинаковым произведением элементов
        int[] row = new int[array.length];
        int[] column = new int[array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                row[i] *= array[i][j];
                column[j] *= array[i][j];
            }
        }

        // Вывод результата
        System.out.println();
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column.length; j++) {
                if (row[i] == column[j]) {
                    System.out.println("Строка " + i + " и столбец " + j + " имеют одинаковое произведение элементов");
                }
            }
        }

        in.close();

    }
}
