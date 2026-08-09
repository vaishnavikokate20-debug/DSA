public class CountSubarrayWithSum {
    public static void Solution(int array[],int k){
        int count=0;
        
        for(int i=0;i<array.length;i++){
            int sum =0;
            for(int j=i;j<array.length;j++){
                sum=sum+array[j];
                if(sum==k){
                
                count++;
                }
                
              
            }

            }
            System.out.print(count);
        }
    
    public static void main(String[] args) {
        int array[]={1,2,3};
        int k=3;
        Solution(array, k);
    }
    
}
