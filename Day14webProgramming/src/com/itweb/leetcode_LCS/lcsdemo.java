package com.itweb.leetcode_LCS;
//dp
public class lcsdemo {
    public static void main(String[] args) {
        String t1="";
        String t2="";
        int lcs = longestCommonSubsequence(t1, t2);
        System.out.println(lcs);
    }
    public static int longestCommonSubsequence(String text1, String text2) {
        char[] char1 = text1.toCharArray();
        char[] char2 = text2.toCharArray();

        int len1 = char1.length;
        int len2 = char2.length;
//        System.out.println(len1+"..."+len2);
        int[][] dp=new int[len1+1][len2+1];
// java auto initialize 0
        for (int i=1;i<=len1;i++){
            for (int j=1;j<=len2;j++){
                if (char1[i-1]==char2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[len1][len2];
    }
}
