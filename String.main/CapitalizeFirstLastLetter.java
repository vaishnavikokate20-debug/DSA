public class CapitalizeFirstLastLetter {
    public static void main(String[] args) {
        String str="khushi kokate";
        char [] arr=str.toCharArray();
         int start=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==' '){
                int end=i-1;
                arr[start]=Character.toUpperCase(arr[start]);
                arr[end]=Character.toUpperCase(arr[end]);
                start=i+1;
            }
        }
        int end=arr.length-1;
          arr[start]=Character.toUpperCase(arr[start]);
         arr[end]=Character.toUpperCase(arr[end]);

        str=new String(arr);
        System.out.println(str);
    }
    
}
