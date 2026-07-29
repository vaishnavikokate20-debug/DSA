public class Sortof12s{
    public static void Sort(int array[]){
        int temp=0;
        for(int j=0;j<array.length;j++){
          for(int i=1;i<array.length;i++){
        if(array[i]<array[i-1]){
            temp=array[i-1];

            array[i-1]=array[i];
            array[i]=temp;
             
            
        }
        
    }
     

      }
      for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
     
    }
    public static void main(String[] args){
        int array[]={1,0,2,1,0};
        Sort(array);
    }
}