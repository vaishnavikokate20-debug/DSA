import java.util.Arrays;
public class longestConsecutive {
    public static void solution(int array[]){
       Arrays.sort(array);
       int currentlength=1;
       int maximum=1;
       
        for(int i=0;i<array.length-1;i++){
            if(array[i+1]==array[i]+1){
                currentlength=currentlength+1;
                maximum=Math.max(maximum, currentlength);
            }
             else if(array[i]==array[i+1]){
                continue;
                

            }
            else{
                currentlength=1;
            }

            
        }
        System.out.print(maximum);
    }

    public static void main(String[] args) {
        
        int array[]={100,2,200,1,3,2,4};
        solution(array);
    }
    
}
