import java.util.*;
class FIFOCache {
    static final int TH = 3;
    static final long EXP = 50000;
    static String[] k = new String[TH], v = new String[TH]; static long[] t = new long[TH];
    static int c = 0;

    static void add(String key, String val) {
        long now = System.currentTimeMillis();

        for (int i = 0; i < c; i++)
            if (k[i].equals(key) && v[i].equals(val)) { //duplicate
                System.out.println("Already exists");
                return;
            }
        if (c == TH) {
            System.arraycopy(k, 1, k, 0, TH - 1);
            System.arraycopy(v, 1, v, 0, TH - 1);
            System.arraycopy(t, 1, t, 0, TH - 1);
            c--;
    }
        k[c] = key;
        v[c] = val;
        t[c++] = now;
        System.out.println("Added successfully");
    }
    static void list() {
        long now = System.currentTimeMillis();
        int w = 0, sno = 1; 
        boolean empty = true;
        
        for (int i = 0; i < c; i++) { //check expiry
            if (now - t[i] > EXP)
                System.out.println("Expired & Key: " + k[i] + " Value: " + v[i]);
            else {
                k[w] = k[i];
                v[w] = v[i];
                t[w++] = t[i];
                System.out.println(sno++ + ". " + k[i] + " " + v[i] + " " + (now - t[i]) / 1000 + "s");
                empty = false;
            }
        }
        c = w;
        if (empty) System.out.println("Cache empty");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.Add  2.List  3.Exit");
            int ch = sc.nextInt(); sc.nextLine();
            if (ch == 1) {
                System.out.print("Key: "); String k = sc.nextLine();
                System.out.print("Value: "); String v = sc.nextLine();
                add(k, v);
            } else if (ch == 2) list();
            else break;
        }
        sc.close();
    }
}
