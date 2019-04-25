import java.util.*;
public class CF096A{
	
	public static void main(String [] Args){
		Scanner scan=new Scanner(System.in);
		String situation=scan.nextLine();
		for (int i=1;i<situation.length() ;) {
			int count=0,flag=0;
			while(i<situation.length() && situation.charAt(i)==situation.charAt(i-1)){
				count++;
				i++;
				flag=1;
			}
			if(flag==0){
				i++;
			}
			if(count>=6){
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		//System.out.println(result);
	}	
}