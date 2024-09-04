package Sems.Sem1;


import java.util.ArrayList;

public class ex_2 {
    public static void main(String[] args) {

        ArrayList<Integer> simpleNumbers = findSimpleNumbers(100);
        for (Integer i : simpleNumbers) {
            System.out.println(i);
        }

    }

    public static ArrayList<Integer> findSimpleNumbers(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean simple = true;
        for (int i = 2; i <= n; i++) {
            simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                result.add(i);
            }
        }
        return result;
    }
}
