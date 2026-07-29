public class twosum {
    public static void Sum(int array[],int target){
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==target){
                    System.out.println(i+" "+ j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4};
        int target=7;
        Sum(array,target);
    }
    
}
