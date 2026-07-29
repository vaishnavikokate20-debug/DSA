public class kadaneSubarray {
    public static void Kadane(int array[]){
        int cs=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            cs=cs+array[i];
            max=Math.max(max,cs);
            if(cs<0){
                cs=0;
            }
        }
        System.out.print(max);
    }
    public static void main(String[] args) {
        int array[]={-2,-3,-5,-2,-7,-4};
        Kadane(array);
    }
    
}
