public class setopUnionIntersection {
    public static void main(String[] args) {
        
        int[][] matrix={
            {1,0,0,0,0},
            {0,2,0,0,0},
            {0,0,3,0,0},
            {0,0,0,4,0},
            {0,0,0,0,5}
        };
        int c=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>0){
                    if(i==j){
                        c+=1;
                    }
                    else{
                        System.out.println("False");
                    }
                }
            }
        }
        if(c==matrix.length){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
