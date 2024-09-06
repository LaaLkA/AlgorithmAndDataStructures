package Sems.Sem2;

public class ex_1_bubbleSort {
    public static void main(String[] args) {
        int N = 10;
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = (int)(Math.random() * 100);
            System.out.printf("%d ", array[i]);
        }

        System.out.println();
        bubbleSort(array);
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", array[i]);
        }
    }

    public static void bubbleSort(int[] array) {
        boolean needSort = true;
        do {
            needSort = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    needSort = true;
                }
            }
        } while (needSort);
    }
}
