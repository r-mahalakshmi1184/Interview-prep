import java.util.*;
public class reversemethod{

    public static int reverseNumber(int n) {
        int rev = 0, r;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }

        return rev;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        System.out.println(reverseNumber(n));
    }
}

