public class linearsearch {
    public static int Linear(int array [],int key){
        for(int i=0;i<array.length;i++){

            if(array[i]==key){
                return i;
            }
            
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[]={1,2,3,4,1};
        int key=3;
        int index=Linear(array,key);
        if(index==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at index=" +  index);
        }
        
    }
    
}
