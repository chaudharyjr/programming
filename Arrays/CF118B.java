import java.util.*;
public class CF118B{

	public static void main(String ... Args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int x=2*n+1;
		int [][] arr=new int [x][x];
		for (int i=0;i<x ;i++ ) {
			Arrays.fill(arr[i],-1);
		}
		arr[n][n]=n;
		for(int k=0;k<n;k++){
			arr [n-k][n]=n-k;
			arr [n+k][n]=n-k;
			arr [n][n+k]=n-k;
			arr [n][n-k]=n-k;
		}
		for (int i=0; i< x;i++ ) {
			for (int j=0;j<x ;j++ ) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}