import java.util.*;
public class CF041A{
	
	public static void main(String [] Args){
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
        String b=scan.nextLine();
        int i=0;
        if(a.length()!=b.length()){
            System.out.println("NO");
            return;
        }
        int len=a.length();
        while(i<a.length() && a.charAt(i)==b.charAt(len-i-1))
        {
            i++;
        }
        if(i==a.length()){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
	}	
}