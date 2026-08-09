public class RowSumMatrix {
    public static void solution(int matrix[][]){
        
        for(int i=0;i<matrix.length;i++){
            int sum=0;
            for(int j=0;j<matrix[0].length;j++){
                sum=sum+matrix[i][j];

            }
            System.out.println("row="+ i+"sum="+sum);
        }
        
    }
     public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,},{4,5,6},{8,9,10}
        };
        solution(matrix);
    }
    
}
