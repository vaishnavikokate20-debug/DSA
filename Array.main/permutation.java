import java.util.Arrays;
public class permutation {
    public static void Solution(int array []){
        int pivot=-1;
        for(int i=array.length-1; i>0;i--) {
            if(array[i]>array[i-1]){
                pivot=i-1;
                break;
             
            }
        }
        for(int i=array.length-1;i>pivot;i--){
            if(array[i]>array[pivot]){
                int temp=array[i];
                array[i]=array[pivot];
                array[pivot]=temp;
                break;
                

            }

        }
        int left=pivot+1;
        int right=array.length-1;
        while(left<right){
            int temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;

        }
       
    }
    public static void main(String[] args) {
        int array[]={1,2,3};
        Solution(array);
         System.out.print(Arrays.toString(array));
    }
    
}
