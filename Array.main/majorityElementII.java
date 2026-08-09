import java.util.HashMap;
public class majorityElementII {
       public static void solution(int array[]){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }
            else{
                map.put(array[i],1);
            }


        }
        for(Integer key:map.keySet()){
            if(map.get(key)>array.length/3){
                System.out.println(key);
            }
        }
         
       }
    public static void main(String[] args) {
        int array[]={1,2,1,1,3,2};
        solution(array);
    }
    
}
