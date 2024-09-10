package Sems.Sem2;

public class ex_2_quickSort {
    public static void main(String[] args) {
        int N = 10;
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.printf("%d ", array[i]);
        }


        quickSort(array);
        System.out.println("\nSorted:");
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", array[i]);
        }

    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);

    }

    public static void quickSort(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int pivot = array[(left + right) / 2];

        do {
            while (array[i] < pivot)
                i++;
            while (array[j] > pivot)
                j--;
            if (i <= j) {
                if (i < j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                i++;
                j--;
            }
        } while (i <= j);
        if (left < j)
            quickSort(array, left, j);

        if (i <= right)
            quickSort(array, i, right);
    }
}
