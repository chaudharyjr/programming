import java.util.*;
public class CF160A{
	
	public static void main(String [] Args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
        int [] arr=new int[n];
        long sum=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
            sum+=arr[i];
        }
        Arrays.sort(arr);
        long curr=0;
        for(int j=n-1;j>=0;j--){
            curr+=arr[j];
            sum-=arr[j];
            if(curr>sum){
                System.out.println(n-j);
                return;
            }
        }
	}	
}