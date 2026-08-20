public class AlphabeticallySorting {

    public static void main(String[] args) {
        String str="dsa";
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }


            }

        }
        String result=new String(arr);
           System.out.println(result);
    }
      
    
}
