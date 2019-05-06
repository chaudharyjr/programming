import java.util.*;
public class CF276A{
	
	public static void main(String [] Args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
        int k=scan.nextInt();
        int max=Integer.MIN_VALUE;
        int f=0;
        int t=0,currentJoy=0;
        for (int i=0;i<n;i++) {
            f=scan.nextInt();
            t=scan.nextInt();
            if(t>k){
                currentJoy=f-(t-k);
            }else{
                currentJoy=f;
            }
            max=Math.max(currentJoy,max);    
        }
        System.out.println(max);
	}	
}