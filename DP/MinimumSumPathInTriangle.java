import java.util.*;
public class MinimumSumPathInTriangle{
	
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int testCase=0; testCase < t ; ++testCase) {
			int n = in.nextInt();
			int [][] arr = new int [n][];
			for (int i = 0; i < n ; ++i) {
				arr[i] = new int [i+1];
				for (int j = 0; j<i+1 ; ++j) {
					arr[i][j]=in.nextInt();
				}
			}
			for (int i = n-2 ; i >= 0 ; --i) {
				for (int j = 0 ; j < arr[i].length ; ++j) {
					arr[i][j] = Math.min(arr[i+1][j+1],arr[i+1][j]) + arr[i][j];
				}
			}
			System.out.println(arr[0][0]);
		}
		
	}
}
