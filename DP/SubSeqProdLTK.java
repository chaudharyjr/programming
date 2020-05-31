import java.util.*;
public class SubSeqProdLTK {

  	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		int testcases = in.nextInt();
		for (int t = 0; t < testcases ; ++t) {
			int n = Integer.parseInt(in.next());
			int [] arr = new int [n];
			int k = in.nextInt();
			for (int i = 0; i < n ; ++i) {
				arr[i] = in.nextInt();
			}
			int [][] dp = new int [k+1][n+1];
			// dp[i][j] denotes the number of subsequences with porduct<i and using j elements
			for (int i = 1; i <= k ; ++i) {
				for (int j = 1; j <= n ; ++j) {
					dp[i][j] = dp[i][j-1];
					if(arr[j-1] <= i && arr[j-1] > 0){
						dp[i][j] += dp[i/arr[j-1]][j-1]+1;
					}
				}
			}
			System.out.println(dp[k][n]);
		}
	}
}
