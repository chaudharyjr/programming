import java.util.*;
public class CF208A{

	public static void main(String ... Args){
		Scanner scan=new Scanner(System.in);
		String remix=scan.nextLine();
		String [] original=remix.split("WUB");
		for(int i=0;i<original.length;i++){
			//WUB WE WUB ARE WUB WUB THE WUB CHAMPIONS WUB MY WUB FRIEND WUB
			if(original[i].length()>0)
				System.out.print(original[i]+" ");
		}
	}
}