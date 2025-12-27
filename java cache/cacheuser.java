import java.util.HashMap;
import java.util.Scanner;
public class cacheuser {
    private HashMap<String, String> cache=new HashMap<>();
    public void put(String key, String value){
        cache.put(key, value);
    }
    public String get(String key){
        return cache.getOrDefault(key,"key not found");
    }
    public static void main(String[]args)
    {
        cacheuser c = new cacheuser();
        Scanner sc = new Scanner(System.in);
        System.out.print("key value pairs");
        int n =sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.print("key:");
            String key = sc.nextLine();
            System.out.print("value:");
            String value = sc.nextLine();
            c.put(key,value);
        }
        System.out.println("\nStored values in cache:");
        for(int i =0;i<n;i++){
            System.out.print("key to retrieve:");
            String key = sc.nextLine();
            System.out.println("Value: " + c.get(key));

        }
        sc.close();

    }
}

    
    

