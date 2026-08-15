public class SumBeautyString {
    public static int Solution(String str){
        int totalBeauty=0;
        for(int i=0;i<str.length();i++){
            int[] frequency=new int [26];
            for(int j=i;j<str.length();j++){
                int index=str.charAt(j)-'a';
                frequency[index]++;
                int maxi=Integer.MIN_VALUE;
                int mini=Integer.MAX_VALUE;
                 for(int k=0;k<26;k++){
                    if(frequency[k]>0){
                    maxi= Math.max(maxi,frequency[k]);
                    mini=Math.min(mini,frequency[k]);
                    }

                }
                totalBeauty+=maxi-mini;
               
                      }


        }
        return totalBeauty;

    }

    public static void main(String [] args){
        String str="aabcbaa";
        System.out.println(Solution(str));
    }
    
}
