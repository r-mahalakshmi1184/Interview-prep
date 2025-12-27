import java.util.*;
public class primeornot {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
            int n =s.nextInt();
            s.close();
            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.print("not prime");
                    return;
                }

            }
            System.out.print("prime");
            

        
    }
    
}
