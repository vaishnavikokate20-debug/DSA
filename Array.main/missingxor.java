public class missingxor{
    public static void missing(int array[],int n) {
        int xor1=0;
        int xor2=0;
        for(int i=1;i<=n;i++){
            xor1^=i;
        }
        for (int i=0;i<array.length;i++){
            xor2^=array[i];
        }
        System.out.println(xor1^xor2);
        
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int n=6;
        missing(array, n);
    }
}


