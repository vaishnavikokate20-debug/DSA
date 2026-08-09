public class searchMatrix {
    public static void solution(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                 if(key==matrix[i][j]){
                    System.out.println("key found at row="+i+" " +"column="+j);
                    return;
                }
           
            }
         
        
    }
    System.out.print("key not found");
    }
     public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,},{4,5,6},{8,9,10}
        };
        int key=5;
        solution(matrix,key);
    }
    
}
