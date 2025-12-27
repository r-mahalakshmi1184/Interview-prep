
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),rev=0,r;
        s.close();
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n/=10;

        }
        System.out.println(rev);

        
       
    }
}

    


