import java.util.HashMap;
public class RomanToInteger {
    public static int Solution(String str){
        HashMap<Character,Integer> map= new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
         int result=0;
        for(int i=0;i<str.length()-1;i++){
            char c1=str.charAt(i);
            char c2=str.charAt(i+1);
           
            if(map.get(c1)<map.get(c2)){
                result=result-map.get(c1);



            }
            else{
                result=result+map.get(c1);
            }
        }
        result=result+map.get(str.charAt(str.length()-1));
        return result;


    }
    public static void main(String[] args) {
        String str="III";
        System.out.println(Solution(str));
    }
    
}
