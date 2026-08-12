public class RemoveOuterParathesis {
    public static String Solution(String str){
        int count=0;
        StringBuilder result = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c1=str.charAt(i);
            if(c1=='('){
                if(count>0){
                    result.append(c1);
                          }
                count++;

            }
             else if(c1==')'){
                count--;
             
                if(count>0){
                    result.append(c1);

                }
                
            }

        }
        return result.toString();

    }
    public static void main(String[] args) {
        String str="()(()())(())";
        System.out.println(Solution(str));
    }
    
}
