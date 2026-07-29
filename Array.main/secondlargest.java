public class secondlargest {
   static int largest=Integer.MIN_VALUE;
    static int secondlargest=Integer.MIN_VALUE;
    public static void largest(int array[]){
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                secondlargest=largest;
                largest=array[i];
                
            }
            else if 
                (array[i]>secondlargest && array[i]!=largest){
                secondlargest=array[i];
            }
        }
             
             if (secondlargest==Integer.MIN_VALUE){
                System.out.println(-1);


             }
             else{
                System.out.println("secondlargest=" + secondlargest);
             }

            

    }

    public static void main(String[] args) {
        int array[]={1,1,1,1};
        largest(array);
        
    }
    
}
