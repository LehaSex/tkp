public class lab_two_19 {
    /*
     * Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент
     */

    public static void main(String[] args) {
        // Заполнение массива
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        // Вывод массива
        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Сжатие массива
        int[] array2 = new int[array.length / 2];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array[i * 2];
        }

        // Вывод результата
        System.out.println();
        System.out.println("Сжатый массив:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
