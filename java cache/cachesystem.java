public class cachesystem {
    String[] keys = new String[10];
    String[]values = new String[10];
    int count=0;

    // put method
    void put(String key, String value){
        keys[count] = key;
        values[count] = value;
        count++;
    }
    
    // get method
    String get(String key) {
        for(int i =0;i<count;i++){
            if(keys[i].equals(key)) {
                return values[i];
            }
        }
        return "key not found";
    }
    // main method
    public static void main(String[]args){
    cachesystem cache = new cachesystem();
    cache.put("id","001");
    System.out.println(cache.get("id"));
}
}
