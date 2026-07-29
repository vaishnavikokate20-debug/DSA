public class majorityelement {
    public static void Major(int array[]){
        int maxi=0;
        int count=0;
        int ans=0;

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[i]==array[j]){
                    
                    count++;
                }
                if(count>maxi){
                    maxi=count;
                    ans=array[i];
                }

            }
        

        }
        System.out.print(ans);
    }
    public static void main(String args[]){
        int array[]={1,2,7,4,7,7,5,7};
        Major(array);
    }
    
}
