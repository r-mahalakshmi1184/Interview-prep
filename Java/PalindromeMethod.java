import java.util.*;

public class PalindromeMethod {

    public static boolean palindrome(int n) {
        int rev = 0, temp = n, r;

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }

        return temp == rev;   // return true if palindrome
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        if (palindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
