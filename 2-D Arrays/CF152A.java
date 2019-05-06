import java.util.*;
public class CF152A{
	
	public static void main(String [] Args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
        int m=scan.nextInt();
        scan.nextLine();
        boolean [] visited=new boolean[n];
        char [][] arr=new char[n][m];
        int k=0;
        for (int i=0;i<n;i++) {
            String temp=scan.nextLine();
            char[] x= temp.toCharArray();
            for( char y:x){
                arr[i][k++]=y;
            }
            k=0;
        }
        for (int j=0;j<m ;j++ ) {
            int max=0;
            for (int i=0;i<n ;i++ ) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
            for (int i=0;i<n ;i++ ) {
                if(arr[i][j]==max){
                    visited[i]=true;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(visited[i]){
                count++;
            }
        }
        System.out.println(count);
	}	
}