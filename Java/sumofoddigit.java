import java.util.*;
public class sumofoddigit {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),sum=0,r;
        s.close();
        while(n>0){
            r=n%10;
            if (r%2!=0){
                sum+=r;
            }
            n/=10;
        }
        System.out.println(sum);
    }
    
}
