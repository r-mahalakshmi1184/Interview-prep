import java.util.*;
public class printonlyprime {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),r=0;
        s.close();
        while(n>0){
            r=n%10;
            if(r==2||r==3||r==5||r==7){
                System.out.print(r);
            }
            n/=10;
        }
    }
    
}
