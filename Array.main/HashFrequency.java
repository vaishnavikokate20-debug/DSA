import java.util.HashMap;

public class HashFrequency {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
         int array[]={1,2,2,1,4};
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+1);

            } else{
                map.put(array[i],1);

            }
           
        }
        System.out.println(map);
    }
    
}
