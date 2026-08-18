public class LongestPalendromicSubstring {
    public static String solution(String str){
        int max=0;
        int start=0;
        int end=0;
        for(int i=0;i<str.length();i++){
            int left=i;
            int right=i;
          while(left>=0&& right<str.length()&&str.charAt(left)==str.charAt(right)){  
            int length=right-left+1;
            if(length>max){
                max=length;
                start=left;
                end=right;
            }
            left--;
            right++;
            }
            left=i;
            right=i+1;
            while(left>=0 && right<str.length()&&str.charAt(left)==str.charAt(right)){
                int length=right-left+1;
                if(length>max){
                    max=length;
                    start=left;
                    end=right;
                }
                left--;
                right++;

            }
           

        }
    
    
      return str.substring(start, end+1);

    }
    public static void main(String[] args) {
        String str="babad";
        System.out.println(solution(str));
    }

    
}
