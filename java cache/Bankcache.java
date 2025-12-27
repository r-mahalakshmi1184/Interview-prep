import java.util.Scanner;
public class Bankcache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] acc = new String[10];
        double[] bal = new double[10];
        int count = 0;

        while (true) {
            System.out.println("\n1.Add 2.Get 3.Remove 4.List 5.Update 6.Exit");
            int ch = sc.nextInt();
            if (ch == 6) break;//exit

            if (ch == 4) { //list
                if (count == 0)
                    System.out.println("No account available");
                else {
                    System.out.println("Total accounts: " + count);
                    for (int i = 0; i < count; i++)
                        System.out.println((i + 1) + ". " + acc[i] + " - " + bal[i]);
                }
                continue;
            }

            System.out.print("Account number: ");
            String a = sc.next();
            int i = 0;
            while (i < count && !acc[i].equals(a)) i++;

            if (ch == 1) { //add
                if (i < count) System.out.println("Account exists");
                else {
                    acc[count] = a;
                    System.out.print("Balance: ");
                    bal[count++] = sc.nextDouble();
                }
            }

            else if (ch == 2) //get
                System.out.println(i == count ? "Not Found" : bal[i]);

            else if (ch == 3) {  //remove
                if (i == count) System.out.println("Not Found");
                else {
                    acc[i] = acc[--count];
                    bal[i] = bal[count];
                }
            }

            else if (ch == 5) { //update
                if (i == count) System.out.println("Not Found");
                else {
                    System.out.print("New Balance: ");
                    bal[i] = sc.nextDouble();   
                    System.out.println("Balance updated");
                }
            }
        }
        sc.close();
    }
}
