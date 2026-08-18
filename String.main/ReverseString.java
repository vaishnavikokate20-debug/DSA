
    public class ReverseString {
    public static void main(String[] args) {
        String str="Khushi";
        char[] arr=str.toCharArray();
          int left=0;
          int right=arr.length-1;
          char temp=arr[left];
          

        while(left<right){
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;



        }

    
       str=new String(arr);
        System.out.println(str);
    
}
}

    

