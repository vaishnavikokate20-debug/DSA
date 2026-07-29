public class longestsubarray {
    public static void subarray(int array[],int k){
        int sum=0;
        int max=0;
        int length=0;
        for(int i=0;i<array.length;i++){
            sum=0;
            
            for(int j=i;j<array.length;j++){
                sum=sum+array[j];
                if(sum==k){
                    length=j-i+1;
                    max=Math.max(max, length);
                     
                }
                


            }
            

        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        int array[]={10,7,5,2,1,9};
        int k=15;
        subarray(array, k);
    }
    
}
