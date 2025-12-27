public class HollowDiamond {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print((k == 1 || k == 2 * i - 1) ? "*" : " ");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++)
                System.out.print((k == 1 || k == 2 * i - 1) ? "*" : " ");
            System.out.println();
        }
    }
}
