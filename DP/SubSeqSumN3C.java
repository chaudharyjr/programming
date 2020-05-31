import java.util.*;
public class Solution {

  	public static void main (String [] args) {
		Scanner in=new Scanner(System.in);
		int testcases = in.nextInt();
		for (int t = 0; t < testcases ; ++t) {
			int n = Integer.parseInt(in.next());
			int [] arr = new int [n];
			for (int i = 0; i < n ; ++i) {
				arr[i] = in.nextInt();
			}
			int [] dp = new int [n];
			if(n >= 1) dp[0] = arr[0];
			if(n >= 2) dp[1] = arr[0] + arr[1];
			if(n > 2) dp[2] = Math.max(Math.max(dp[1],arr[0]+arr[2]), arr[1]+arr[2]);
			for (int i = 3; i < n ; ++i) {
				dp[i] = Math.max( Math.max(dp[i-1],dp[i-2]+arr[i]),dp[i-3]+arr[i]+arr[i-1]);
			}
			System.out.println(dp[n-1]);
		}
	}
}
