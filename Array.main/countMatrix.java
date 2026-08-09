public class countMatrix {
    public static void solution(int matrix[][]){
        int row=matrix.length;
        int column=matrix[0].length;
        System.out.println(row);
        System.out.println(column);
    }
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3},{4,5,6},{7,8,9}
        };
        solution(matrix);
    }
    
}
