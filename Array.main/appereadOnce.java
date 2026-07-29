public class appereadOnce {
    public static void once(int array[]) {
        int result=0;
        for(int i =0;i<array.length;i++){
            result=result^array[i];
            

        }
        System.out.print(result);

        
    }
    public static void main(String[] args) {
        int array[]={1,2,3,1,2};
        once(array);
    }
    
}
