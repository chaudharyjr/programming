import java.util.*;
public class CF137B{

	public static void main(String ... Args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		boolean [] arr=new boolean [5000+1];
		for(int i=1;i<=n;i++){
			int temp=scan.nextInt();
			if(!arr[temp]) arr[temp]=true;
		}
		int count=0;
		for (int i=1;i<=n;i++ ) {
			if(!arr[i]) count++;
		}
		System.out.println(count);
	}
}