public class DP {

    public static int lcsDP(String s1, String s2, int i, int j){

        int [][]dp= new int[i+1][j+1];
        for(int m=1;m<=i;m++){               //dont forget to start from index 1 fot both string;
            // System.out.println("");
            for(int n=1;n<=j;n++){
                dp[m][n]=-1;
                // System.out.print(dp[m][n]);
            }
        }

        return findSubCharacters(s1, s2, i, j, dp);
    }

    public static int findSubCharacters(String s1, String s2, int i, int j, int dp[][]) {

        if (i == 0 || j == 0) {
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
            return dp[i][j]=1 + findSubCharacters(s1, s2, i - 1, j - 1, dp);
        } else {
            return dp[i][j]=Math.max(findSubCharacters(s1, s2, i - 1, j,dp), findSubCharacters(s1, s2, i, j - 1, dp));
        }

    }

    public static void main(String[] args) {

        String st1 = "vikash";
        String st2 = "iskh";

        System.out.println(lcsDP(st1, st2, st1.length(), st2.length()));
    }
}
