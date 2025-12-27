import java.util.*;
public class sumstillsingle {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n= s.nextInt(),r,sum=0;
        s.close();
        while(n>0 || sum>9){
            if(n==0){
                r=sum;
                sum=0;
            }
            r=n%10;
            sum+=r;
            n/=10;
        }
        System.out.println(sum);
    }

    
}
