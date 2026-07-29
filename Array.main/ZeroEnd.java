public class ZeroEnd {
    public static void MovingZero(int array[]){
        int j=0;
        
          for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                array[j]=array[i];
                j++;

            }
            
        }
        for(int i =j;i<array.length;i++){
            array[i]=0;
        }

        
    }
    public static void main(String[] args) {
        int array[]={1,2,0,0,3,4};
        MovingZero(array);
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    
}
