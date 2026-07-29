public class StockBuySell {
    public static void Solution(int array []){
        int maxi=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int profit=0;
        
        int sc=0;
        for(int i=0;i<array.length-1;i++){
             min=Math.min(min,array[i]);
             profit=array[i]-min;
             maxi=Math.max(maxi,profit);
             
        }
        System.out.print(maxi);
        
    }
    public static void main(String[] args) {
        int array[]={10,7,5,8,11,9};
        Solution(array);
    }
    
}
