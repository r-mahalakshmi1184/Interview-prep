import java.util.*;
public class numofdigit {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt(),count=0;
        s.close();
        while(n>0){
            n/=10;
            count++;
            
           

        }
        System.out.println(count);

    }
    
}
