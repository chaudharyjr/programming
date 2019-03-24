import java.util.*;
public class CF242A{

	public static void main(String ... Args){
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		ArrayList<Integer> p=new ArrayList<Integer>();
		ArrayList<Integer> q=new ArrayList<Integer>();
		int count=0;
		for (int i=a;i<=x;i++) {
			for (int j=b; j<=y ;j++) {
				if(i>j) {
					count++;
					p.add(i);
					q.add(j);	
				}
				else if(i<j){
					break;	
				} 
			}
		}
		System.out.println(count);
		for(int i=0;i<p.size();i++){
			System.out.print(p.get(i)+" "+q.get(i));
			System.out.println();
		}
	}
}