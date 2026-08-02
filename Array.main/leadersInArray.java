public class leadersInArray {
    public static void solution(int array[],int array1[]){
        int max=Integer.MIN_VALUE;
        int count=0;
        

        for(int i=array.length-1;i>0;i--){
            if(array[i]>max){
            max=Math.max(max, array[i]);
           array1[count]=array[i];
           count++;
           

            }
           

        }
       for(int i=count-1;i>=0;i--){
         System.out.print(array1[i] + " ");

       }

    }
    public static void main(String[] args) {
        int array[]={1,2,5,3,1,2};
        int array1[]= new int [array.length];
        solution(array, array1);
    }
    
}
