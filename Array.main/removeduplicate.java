// public class removeduplicate {
//     static int counter=1;
//     public static void duplicate(int array[]){
//         for (int i=0;i<array.length-1;i++){
//             if(array[i]!=array[i+1]){
//                 counter=counter+1;
//             }
//             else{
//                 counter=counter;
//             }
//         }
//         System.out.println(counter);

//     }
//     public static void main(String[] args) {
//         int array[]={-2, 2, 4, 4, 4, 4, 5, 5};
//         duplicate(array);
        
//     }
    
// }
// //THis approch only count the unique element  doesnt remove the duplicates ..
// // to remove duplicates the only way is to use the two pointer approaches...


public class removeduplicate {

    public static int duplicates(int array[]) {

        int i = 0;

        for (int j = 1; j < array.length; j++) {

            if (array[i] != array[j]) {

                i++;
                array[i] = array[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int array[] = {1, 1, 2, 3, 3, 4, 4, 4, 4};

        int newlength = duplicates(array);

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < newlength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}