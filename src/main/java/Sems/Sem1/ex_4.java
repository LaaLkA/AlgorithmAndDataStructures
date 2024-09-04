package Sems.Sem1;

import java.util.Date;

public class ex_4 {

    public static void main(String[] args) {
        test();
    }

    public static int fib_rec(int n) {
        if (n == 1 || n == 2)
            return 1;
        return fib_rec(n - 1) + fib_rec(n - 2);
    }

    public static int fib_lin(int n) {
        final int[] numbers = new int[n + 1];
        numbers[1] = 1;
        numbers[2] = 1;
        for (int i = 3; i <= n; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers[n];
    }

    public static void test() {


        for (int n = 10; n <= 45; n++) {
            Date start = new Date();
            fib_rec(n);
            Date stop = new Date();
            long time1 = stop.getTime() - start.getTime();

            start = new Date();
            fib_lin(n);
            stop = new Date();
            long time2 = stop.getTime() - start.getTime();

            System.out.printf("n: %d, rec: %d, lin: %d%n", n, time1, time2);
        }
    }
}
