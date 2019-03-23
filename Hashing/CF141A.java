import java.util.*;
public class CF141A{

	public static void main(String ... Args){
		Scanner scan=new Scanner(System.in);
		String a=scan.nextLine();
		String b=scan.nextLine();
		String c=scan.nextLine();
		int alphabet []=new int[26];
		//In this array, take the alphabet count of all the characters in string a and string b.
		for(int i=0;i<a.length();i++){
			alphabet[a.charAt(i)-'A']++;
		}
		for(int i=0;i<b.length();i++){
			alphabet[b.charAt(i)-'A']++;
		}
		//Now for each character in string c check if it is still available in out alphabet 
		//and if it is not available (i.e, count becomes < 0 then print "NO")
		for(int i=0;i<c.length();i++){
			alphabet[c.charAt(i)-'A']--;
			if(alphabet[c.charAt(i)-'A']<0){
				System.out.println("NO");
				return;
			}
		}
		//This is to check if any extra character was added or not
		for(int i=0;i<26;i++){
			if(alphabet[i]>0){
				System.out.println("NO");
				return;	
			}
		}
		System.out.println("YES");
	}
}