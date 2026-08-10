import java.util.HashMap;
public class anagram {
    public static boolean Solution(String str,String str1){
        if(str.length()!=str1.length()){
            return false;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++){
        char c1=str.charAt(i);
         if(map.containsKey(c1)){
           map.put(c1,map.get(c1)+1);

        }
        else{
            map.put(c1, 1);
        }

    }
    for(int i=0;i<str1.length();i++){
        char c2=str1.charAt(i);
        if(!map.containsKey(c2)){
            return false;
        }
        else{
            map.put(c2,map.get(c2)-1);
         }
    }
    for(int value:map.values()){
        if(value!=0){
            return false;
        }
        
    }
    return true;
}

    public static void main(String[] args) {
        String str="anagram";
        String str1="nagaram";
        System.out.println(Solution(str, str1));
    }
    
}
