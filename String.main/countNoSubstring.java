public class countNoSubstring {
    public static int Solution(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                count++;

            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="abcdabc";
        System.out.println(Solution(str));
    }
    
}
