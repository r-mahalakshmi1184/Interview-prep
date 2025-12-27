import java.util.HashMap;
public class Cache {
    private HashMap<String, String> cache = new HashMap<>();
    // store data
    public void put(String key, String value){
        cache.put(key, value);
    }
    // retrieve data
     public String get(String key){
        return cache.getOrDefault(key, "key not found");


     }
     //main method
     public static void main(String[] args){
        Cache c = new Cache();
        String[] keys = {"id","company"};
        String[] values = {"001","XY"};
        for(int i=0;i<keys.length;i++){
            c.put(keys[i],values[i]);
            System.out.println(keys[i]+" : "+c.get(keys[i]));
        }
     }
    
}
