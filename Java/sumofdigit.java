import java.util.*;
public class sumofdigit {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt(),sum=0;
        s.close();
        while(n>0){
            int r=n%10;
            sum+=r;
            n/=10;

        }
        System.out.println(sum);
    }
    
}
