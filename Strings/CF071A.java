import java.util.*;
public class CF071A{

	public static void main(String ... Args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<n;i++){
			String current=scan.nextLine();
			if(current.length()<=10){
				System.out.println(current);
			}else{
				System.out.println(Character.toString(current.charAt(0))+Integer.toString(current.length()-2)+Character.toString(current.charAt(current.length()-1)));
			}
			
		}
	}
}