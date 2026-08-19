public class RemoveSpaces {
    public static void main(String[] args) {
        String str="Khushi Kokate";
        char [] arr=str.toCharArray();
        String result="";
      for(int i=0;i<arr.length;i++){
        if(arr[i]!=' '){
            result=result+arr[i];


        }
      }
      System.out.println(result);
    }
    
}
