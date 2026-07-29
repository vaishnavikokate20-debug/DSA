import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"khushi");
        map.put(2,"vaishnavi");
        map.put(3, "khush");
        if(map.containsKey(3)){
            System.out.println(map.get(3));

        }
        else{
            System.out.println("key not exist");
        }
        System.out.println(map.get(1));
        System.out.println(map.get(5));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("khushi"));
        map.remove(1);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.get(3));
        for(Integer key: map.keySet()){
            System.out.println(key);
        }
        for(String value :map.values()){
            System.out.println(value);
        }
        for(Integer key:map.keySet()){
            System.out.println(key + "==>"+ map.get(key));
        }

    }
    
}
