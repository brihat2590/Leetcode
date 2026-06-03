class Solution {
    public void setZeroes(int[][] matrix) {

        int m=matrix.length;//rows
        int n=matrix[0].length; //column ko lenght

        int[]rows=new int[m]; //aile lai value 000 vairakxa

        int[] cols=new int[n];


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rows[i]=1;
                    cols[j]=1;
                    //marked 
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rows[i]==1||cols[j]==1){
                    //zero gardiney 
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}