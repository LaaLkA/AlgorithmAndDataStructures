package HW.HW2;

public class pyramidSort {
    public static void main(String[] args) {
        int N = 15;
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.printf("%d ", array[i]);
        }

        sort(array);
        System.out.println("\nSorted:");
        for (int val : array)
            System.out.printf("%d ", val);
    }

    /*
    Метод сортировки кучей (пирамидальный)
     */
    public static void sort(int[] array) {
        int temp;
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heap(array, array.length, i);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heap(array, i, 0);
        }
    }

    /*
    Метод для создания кучи
     */
    public static void heap(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;
        int temp;

        if (leftChild < heapSize && array[leftChild] > array[largest])
            largest = leftChild;
        if (rightChild < heapSize && array[rightChild] > array[largest])
            largest = rightChild;
        if (largest != rootIndex) {
            temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heap(array, heapSize, largest);
        }
    }
}
