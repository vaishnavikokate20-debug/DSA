public class LargestElementMatrix {
    public static void solution(int matrix[][]){
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                maxi=Math.max(maxi, matrix[i][j]);
            }
        }
        System.out.println(maxi);
    }
     public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,},{4,5,6},{8,9,10}
        };
        solution(matrix);
    }
    
}
