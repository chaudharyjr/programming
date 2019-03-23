import java.util.*;
public class CF432A{
	public static void main(String ... Args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=5-scan.nextInt();
		}
		int count=0;
		for(int i=n-1;i>=0;i--){
			if(arr[i]>=k){
				count++;
			}
		}
		System.out.println(count/3);
	}
}