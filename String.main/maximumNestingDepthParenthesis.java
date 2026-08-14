public class maximumNestingDepthParenthesis {
    public static int Solution(String str, String str2){
         int count=0;
            int maxi=0;
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                count++;
                maxi=Math.max(maxi, count);
            }
            else if(str.charAt(i)==')'){
                count--;
            }
        }
        return maxi;

    }
    public static void main(String[] args) {
        String str= "(1+(2*3)+((8)/4))+1";
        String str2="(1)+((2))+(((3)))";
        System.out.println(Solution(str,str2));
    }
}
