public class VowelsConsonants {
    public static void main(String[] args) {
        String str="aeiousdfg";
        for(int i=0;i<str.length();i++){
            if("aeiou".indexOf(str.charAt(i))!=-1){
                System.out.println(str.charAt(i)+" "+ "is vowel");


            }
            else{
                System.out.println(str.charAt(i)+" is not vowel");
            }

        }
    }
    
}
