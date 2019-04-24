import java.util.*;
public class CF672B{
	
	public static void main(String [] Args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String temp=scan.next();
		int [] count=new int [26];
		for (int i=0;i<temp.length() ;i++ ) {
			count[temp.charAt(i)-'a']+=1;
		}
		int notPresent=0,answer=0;
		for(int i=0;i<=25;i++){
			if(count[i]==0){
				notPresent+=1;
			}else{
				answer+=(count[i]-1);
			}
		}
		if(notPresent<answer){
			System.out.println(-1);
		}else{
			System.out.println(answer);
		}
		//System.out.println(result);
	}	
}
