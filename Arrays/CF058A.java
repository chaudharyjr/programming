import java.util.*;
public class CF058A{
	
	public static void main(String [] Args){
		Scanner scan=new Scanner(System.in);
		String q=scan.nextLine();
        char [] arr={'h','e','l','l','o'};
        int i=0;
        for (char c : arr) {
            while (i<q.length() && q.charAt(i)!=c) {
                i++;
            }
            if(i>=q.length())
            {
                System.out.println("NO");
                return;
            }
            i++;
        }
        System.out.println("YES");    
        
	}	
}