import java.util.*;
public class palindrome {
    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        int n = s.nextInt(),rev=0,r,m=n;
        s.close();
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        if(m==rev){

        System.out.println("palindrome");
        }
        else{
        System.out.println("not palindrome");
        }
    }
}

    
    

