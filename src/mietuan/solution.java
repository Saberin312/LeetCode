//package mietuan;
//
///***
// *@Author:BHR
// *@Description:
// *@Date:Created in 19:08 2020/3/12
// *@Modified By:
// */
//
//public class solution {
//
//    public int main(int n, char[] n1,char[]n2) {
//        int[][] grid = new int[2][n];
//
//        for (int i = 0; i < n; i++) {
//            grid[0][i] = 0;
//        }
//
//        for (int i = 1; i < n; i++) {
//            grid[1][i] = 0;
//        }
//
//        for (int row = 0; row < 2; row++) {
//            for (int column = 1; column <n ; column++) {
//                grid[row][column] = grid[row - 1][column] + grid[row][column - 1];
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            if (n2[n - i - 1] == 'X') {
//                grid[0][0]=0;
//            }
//            grid[1][n - 1] = 1;
//
//        }
//        return grid[0][n - 1];
//    }
//    public int main2(int n, char[] n1,char[]n2) {
//
//        int dp[][] = new int[2][n];
//        if(n2[n-1]=='X') dp[1][n-1]=0;
//        if(n2[n-1]=='.') dp[1][n-1]=1;
//        for(int i=n-2;i>=0;i--){
//            if(obstacleGrid[i][n-1]==0&&dp[i+1][n-1]==1) dp[i][n-1]=1;
//            else dp[i][n-1]=0;
//        }
//        for(int i=n-2;i>=0;i--){
//            if(obstacleGrid[m-1][i]==0&&dp[m-1][i+1]==1) dp[m-1][i]=1;
//            else dp[m-1][i]=0;
//        }
//        for(int i=m-2;i>=0;i--){
//            for(int j=n-2;j>=0;j--){
//                if(obstacleGrid[i][j]==0){
//                    dp[i][j] = dp[i+1][j]+dp[i][j+1];
//                }
//                else dp[i][j]=0;
//            }
//        }
//        return dp[0][0];
//    }
//}