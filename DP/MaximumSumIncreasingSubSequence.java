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
			int result = arr[0];
			for (int i = 0; i < n ; ++i) {
				dp[i] = arr[i];
				for (int j = 0; j < i ; ++j) {
					if(arr[i] > arr[j]){
						dp[i] = Math.max(dp[j]+arr[i],dp[i]);
						result = Math.max(result , dp[i]);
					}
				}	
			}
			System.out.println(result);
		}
	}
}
