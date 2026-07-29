public class RearrangeArray {
    public static void Solution(int array[],int ans[]){
        int positiveindex=0;
        int negativeindex=1;
        
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                ans[ positiveindex]=array[i];
                positiveindex +=2;

                
            }
            else{
                ans[negativeindex]=array[i];
                negativeindex +=2;
                
            }

            

                }
                for(int i=0;i<ans.length;i++){
                    System.out.print(" " +ans[i]);

                }
             }
        

    
    public static void main(String[] args) {
        int array[]={2,4,5,-1,-3,-4};
        int ans[]=new int[array.length];
        Solution(array, ans);
    }
    
}
