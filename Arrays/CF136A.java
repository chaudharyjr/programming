import java.util.*;
public class CF136A{
	
	public static void main(String [] Args){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
        int [] arr=new int [test+1];
        for (int i=0;i<test;i++) {
            arr[scan.nextInt()]=i+1;    
        }
        for (int i=1;i<=test;i++ ) {
            System.out.print(arr[i]+" ");
        }
	}	
}