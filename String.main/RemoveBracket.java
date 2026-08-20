public class RemoveBracket {
    public static void main(String[] args) {
        String str= "a+(b*c)-{d/e}";
         String str2="";
        for(int i=0;i<str.length();i++){
            char c1=str.charAt(i);
            if(c1!='('&&c1!=')'&& c1!='{'&&c1!='}'&&c1!='['&&c1!=']'){
                str2=str2+c1;


            }

        }
        System.out.println(str2);
    }
    
}
