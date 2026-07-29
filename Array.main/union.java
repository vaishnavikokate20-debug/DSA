import java.util.Arrays;
public class union {
    public static void UnionOfArray(int array1[],int array2[]){
        Arrays.sort(array1);
        int i=0;
        int j=0;
         while(i< array1.length && j <array2.length){
            if(array1[i]<array2[j]){
                System.out.print(array1[i]);
                
              i++;
            }
            
            else if(array2[j]<array1[i]){
                System.out.print(array2[j]);
                j++;
            }
            

            else{
                System.out.print(array1[i]);

              i++;
            j++;  

            }
            
         }
         while(i<array1.length){
            System.out.print(array1[i]);
            i++;

         }
         while(j<array2.length){
            System.out.print(array2[j]);

            j++;

         }

    }
    public static void main(String[] args) {
        int array1[]={4,5,3,1,2};
        int array2[]={4,5,6,7};
        UnionOfArray(array1, array2);

    }
    
}
