public class ReverseWord {
    public static String Solution(String str){
        int i=str.length()-1;
        String result="";
        while(i>=0){
            

       
        while(i>=0 && str.charAt(i)==' '){
            i--;
        }
        if (i < 0) {
                break;
            }

        
        int end=i;
        while(i>=0 && str.charAt(i)!= ' '){
            
            i--;
         
        }
         int start=i+1;
         
          String word=str.substring(start, end+1);
          if(result.isEmpty()){
            result=word;
          }
          else{
            result=result+" "+word;
          }
    }
       
    
    return result;
    
    


    }
    public static void main(String[] args) {
        String Str=" Welcome to the Jungle ";
        System.out.println(Solution(Str));
    }
    
}
