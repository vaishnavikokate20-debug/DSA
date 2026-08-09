public class setMatrixZero {
    public static void solution(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                   matrix[i][matrix.length-1-i]=0;

                    


                }

            }
        }
        
    }
    public static void main(String[] args) {
        int matrix [][]={
            {1,1,1},{1,0,1},{1,1,1}
        };
    }
    
}
