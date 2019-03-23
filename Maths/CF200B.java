import java.util.*;
import java.math.*;
public class CF200B{

	public static void main(String ... Args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		double num=0;
		double den=0;
		for(int i=0;i<n;i++){
			num+=scan.nextInt();
			den+=100;
		}
		System.out.println(num/den*100);
	}
}