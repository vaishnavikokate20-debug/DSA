public class shortestPalindrome {
    public static boolean Solution(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }    
         return true;     
    }
    public static String ShortestPalindrome(String str){
         for(int i=str.length()-1;i>=0;i--){
            String Prefix=str.substring(0,i+1);
           if(Solution(Prefix)){
            System.out.println(Prefix);
            
           
             String remaining=str.substring(i+1);  //if you want to go till the end you dont need to provide d=socond argument in java
                 char []arr=remaining.toCharArray();
                 int start=0;
                 char temp=0;
                 int end =arr.length-1;
                 while(start<end){
                    temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                    start++;
                    end--;

                 }
                
                 String str1=new String(arr);

              String result=str1+str;
              return result;
                }
        
        
        
            }

          return str;  

    }
    public static void main(String[] args) {
        String str="abcd";
        System.out.println(ShortestPalindrome(str));

    }

    
}
