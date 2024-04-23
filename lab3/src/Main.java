import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размерности массива
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Ввод элементов массива
        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter [" + i + "] element: ");
            array[i] = scanner.nextInt();
        }

        // Вывод массива
        System.out.println("\nEntered array:");
        for (int obj : array)
        {
            System.out.print(obj + " ");
        }

        // Выполнение сортировки
        Sorter.shakerSort(array);

        // Вывод массива после сортировки
        System.out.println("\nArray after shaker sorting:");
        for (int obj : array)
        {
            System.out.print(obj + " ");
        }
    }
}