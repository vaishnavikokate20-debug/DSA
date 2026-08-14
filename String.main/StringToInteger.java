public class StringToInteger {
    public static int Solution(String str){
        int i=0;
        
        while(i<str.length()&&str.charAt(i)==' '){
        
            i++;


        }
        int sign=1;
        if(i<str.length()&&str.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(i<str.length()&&str.charAt(i)=='+'){
            sign=+1;
            i++;

        }
         int number=0;
        while(i<str.length()&&Character.isDigit(str.charAt(i))){
            int digit=str.charAt(i)-'0';
            number=number*10+digit;
            i++;

        }if (sign == 1 && number > 2147483647) {
                return 2147483647;
            }

            if (sign == -1 && number > 2147483648L) {
                return -2147483648;
            }

            i++;
        
        return number*sign;
        

    }
    public static void main(String[] args) {
        String str="  -1234";
        System.out.println(Solution(str));

    }
    
}
