import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter [" + i + "] element: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nEntered array:");
        for (int obj : array)
        {
            System.out.print(obj + " ");
        }

        Sorter.shakerSort(array);
        System.out.println("\nArray after shaker sorting:");
        for (int obj : array)
        {
            System.out.print(obj + " ");
        }
    }
}