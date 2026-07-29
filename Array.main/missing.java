// public class missing {
//     public static void missing(int array1 [],int array2[]){
//         int sum1=0;
//         int sum2=0;
//         for(int i=0;i<array1.length;i++){
//             sum1+=array1[i];
            
//         }
//         for(int i=0;i<array2.length;i++){
//             sum2+=array2[i];
            
//         }
    
//         System.out.print(sum2-sum1);
       
//     }
//     public static void main(String[] args) {
//         int array1[]={1,2,3,5};
//         int array2[]={1,2,3,4,5};
//         missing(array1, array2);
        
//     }
// }
public class missing{
    public static void missingnumber(int array []){
        int n=6;
        int sum=0;
        int expectedsum=n*(n+1)/2;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.print(expectedsum-sum);
    }

public static void main(String[] args) {
    int array[]={1,2,3,4,6};
    missingnumber(array);
    
}
}

