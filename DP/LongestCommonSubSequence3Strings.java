import java.util.*;
public class Solution {

  	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		int testcases = in.nextInt();
		for (int t = 0; t < testcases ; ++t) {
			int p = Integer.parseInt(in.next());
			int q = Integer.parseInt(in.next());
			int r = Integer.parseInt(in.next());
			String a = in.next();
			String b = in.next();
			String c = in.next();
			int [][][] dp = new int [p+1][q+1][r+1];
			for (int i = 1; i < p+1 ; ++i) {
				for (int j = 1; j < q+1 ; ++j) {
					for (int k = 1; k < r+1 ; ++k) {
						if(a.charAt(i-1) == b.charAt(j-1) && b.charAt(j-1) == c.charAt(k-1)){
							dp[i][j][k] = dp[i-1][j-1][k-1] + 1;
						}else{
							dp[i][j][k] = Math.max(Math.max(dp[i][j][k-1],dp[i][j-1][k]),dp[i-1][j][k]);
						}
					}
				}	
			}
			System.out.println(dp[p][q][r]);
		}
	}
}
