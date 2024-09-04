package Lects.Lect2;

public class ex_4_Find {

    public static void main(String[] args) {
        int[] array = new int[]{
                4, 2, 5, 8, 1, 9, 2, 3, 6, 8, 5
        };
        System.out.println(find(array, 1));
    }
    public static int find(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
