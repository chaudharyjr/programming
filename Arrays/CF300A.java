import java.util.*;
public class CF300A{

	public static void main(String ... Args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		ArrayList<Integer> l=new ArrayList<Integer>();
		ArrayList<Integer> e=new ArrayList<Integer>();
		ArrayList<Integer> g=new ArrayList<Integer>();
		int [] arr=new int[n];
		int countLess=0,countGreater=0;
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
			if(arr[i]<0) countLess+=1;
			if(arr[i]>0) countGreater+=1;
		}
		for(int i=0;i<n;i++){
			int temp=arr[i];
			if(temp<0){
				l.add(temp);
			}else if(temp==0){
				e.add(temp);
			}else{
				g.add(temp);
			}
		}
		if(countGreater==0){
			int temp=l.get(l.size()-1);
			g.add(temp);
			l.remove(l.size()-1);
			temp=l.get(l.size()-1);
			g.add(temp);
			l.remove(l.size()-1);
		}
		if(l.size()%2==0){
			int temp=l.get(l.size()-1);
			e.add(temp);
			l.remove(l.size()-1);
		}
		
		System.out.print(l.size()+" ");
		for(int i=0;i<l.size();i++){
			System.out.print(l.get(i)+" ");
		}
		
		System.out.println();
		System.out.print(g.size()+" ");
		for(int i=0;i<g.size();i++){
			System.out.print(g.get(i)+" ");
		}
		System.out.println();
		System.out.print(e.size()+" ");
		for(int i=0;i<e.size();i++){
			System.out.print(e.get(i)+" ");
		}

	}
}