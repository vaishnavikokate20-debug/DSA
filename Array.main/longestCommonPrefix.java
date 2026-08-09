class longestCommonPrefix{
    public String Solution(String [] str){
        String prefix=str[0];
        for(int i=1;i<str.length;i++){
             while(!str[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.length()==0){
                    return"";
                }
             }

        }
        return prefix;
    
    }
    public static void main(String[] args) {
        String str[]={"flower","flo","fly","flight"};
        longestCommonPrefix obj=new longestCommonPrefix();
        System.out.print(obj.Solution(str));
    }
}