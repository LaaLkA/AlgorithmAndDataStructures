package Sems.Sem1;

public class ex_3 {
    public static void main(String[] args) {
        System.out.println(comb_1(6));
        System.out.println(comb_2(4, 6));
    }

    public static int comb_1(int n) {
        // k = 4
        int count = 0;
        // O(n^4)
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                for (int k = 1; k <= n; k++)
                    for (int l = 1; l <= n; l++)
                        count++;
        return count;
    }

    public static int comb_2(int k, int n) {
        if (k > 0) {
            return comb_2_rec(1, k, n);
        }
        return 0;

    }

    private static int comb_2_rec(int deep, int k, int n) {
        if (deep == k + 1) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += comb_2_rec(deep + 1, k, n);
        }
        return count;
    }
}
