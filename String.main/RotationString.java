public class RotationString {
    public static boolean Solution(String str,String goal){
        if(str.length()!=goal.length()){
            return false;
        }
        String str1=str+str;
        if(str1.contains(goal)){
            return true;

        }
        return false;
        



    }
    public static void main(String[] args) {
        String str="abcde";
        String goal="bcdea";
        System.out.println(Solution(str, goal));
    }
    
}
