import java.util.HashMap;
public class IsomorphicString {
    public  static boolean Solution(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false ;

        }
        HashMap<Character,Character>map1=new HashMap<>();
        HashMap<Character,Character>map2=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char c1=str1.charAt(i);
            char c2=str2.charAt(i);
            if(map1.containsKey(c1)!=map2.containsKey(c2)){
                return false;
            }
            if(map1.containsKey(c1)&&map2.containsKey(c2)){
                if(map1.get(c1)!=c2||map2.get(c2)!=c1){
                    return false;
                }
            }
            
            else{
                map1.put(c1,c2);
                map2.put(c2,c1);
            }

        }
       return true; 
    
    }
    public static void main(String[] args) {
        String str1="egg";
        String str2="ade";
         System.out.println(Solution(str1, str2));

    }

    
}
