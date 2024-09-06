package Sems.Sem2;

public class ex_4_binarySearch {
    public static void main(String[] args) {
        int N = 20000;
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println(binarySearch(array, 42));

    }

    public static Integer binarySearch(int[] array, int value) {
        quickSort(array);
        int left = 0, right = array.length - 1;

        while (right - left > 1) {
            int mid = (left + right) / 2;
            if (array[mid] < value)
                left = mid;
            else
                right = mid;
        }
        if(array[left] == value)
            return left;
        if (array[right] == value)
            return right;
        return null;
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
