import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class SortByFrequency {
    public static char[] Solution(String str){
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c1=str.charAt(i);
            if(map.containsKey(c1)){
                map.put(c1,map.get(c1)+1);

            }
            else{
                map.put(c1, 1);
            }
        }
        ArrayList<Character> list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b) ->{
            if(!map.get(a).equals(map.get(b))){
                return map.get(b)-map.get(a);
            }
            return Character.compare(a,b);
        }
    );
    char[]result=new char[list.size()];
    for(int i=0;i<list.size();i++){
        result[i]=list.get(i);
    }
    return result;

    }
    public static void main(String[] args) {
        String str="tree";
        System.out.println(Arrays.toString(Solution(str)));
    }

    
}
