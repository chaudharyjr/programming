import java.util.*;
public class CF320A{

	public static void main(String ... Args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String [] sub={"1","14","144"};
		int count=0;
		String ques=Integer.toString(n);
		ques=ques.replace("144"," ");
		ques=ques.replace("14"," ");
		ques=ques.replace("1"," ");
		for (int i=0;i<ques.length() ;i++ ) {
			if(ques.charAt(i)!=' '){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}