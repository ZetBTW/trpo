public class Sorter {
    public static void shakerSort(int[] array)
    {
        int left = 0;
        int right = array.length - 1;
        int last_swap_idx = right;

        while (left < right)
        {
            for (int i = left; i < right; i++)
            {
                if (array[i] > array[i+1])
                {
                    swap(array, i, i+1);
                    last_swap_idx = i;
                }
            }
            right = last_swap_idx;

            for (int i = right; i > left; i--)
            {
                if (array[i] < array[i-1])
                {
                    swap(array, i, i-1);
                    last_swap_idx = i;
                }
            }
            left = last_swap_idx;
        }

    }

    private static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
