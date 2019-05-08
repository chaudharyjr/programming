import java.util.*;
public class CF122A{
	
	public static void main(String [] Args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
        int [] arr={4,7,47,74,444,447,477,777,774,744,747,474};
        for(int i=0;i<arr.length;i++){
            if(n%arr[i]==0){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
	}	
}