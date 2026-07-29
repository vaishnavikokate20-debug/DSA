public class maximumconsecutive {
    public static void Maximum(int array[]){
        int counter=0;
        int max=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==1){
              counter=counter+1;
              max=Math.max(max,counter);

            }
            else{
                counter=0;
            }
        }
        System.out.println(max);
    }
public static void main(String[] args) {
    int array[]={1,1,2,0,0,1,1,1,1,0,0,1,1,1,1,1,1};
    Maximum(array);
    
}
    
}
