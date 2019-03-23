import java.util.*;
public class CF110A{
	public static void main(String ... Args){
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		long countFourSeven=0;
		String ques=""+n;
		for(int i=0;i<ques.length();i++){
			if(ques.charAt(i)-'4'==0 || ques.charAt(i)-'7'==0){
				countFourSeven+=1;
			}
		}
		if(countFourSeven==4 || countFourSeven==7){
			System.out.println("YES");	
		}else{
			System.out.println("NO");
		}
		
	}
}