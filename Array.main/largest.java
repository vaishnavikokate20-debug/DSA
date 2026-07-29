public class largest{
    public static void largestelement(int array[]){
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
            System.out.println(max);
            

        }
  public static void main(String args[]){
        int array[]={1,2,3,4,5};
        largestelement(array);
        
        
    
}
}
    


