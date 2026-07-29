public class leftRotationByOne {
     
    public static void LeftRotation(int array[]){
        int temp=array[0];
        for(int i=1;i<array.length;i++){
            array[i-1]=array[i];
            

        

        }
        array[array.length-1]=temp;
    
 

    }
    public static void main(String[] args) {
        int array[]={1,2,3,4};
        LeftRotation(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    
}
