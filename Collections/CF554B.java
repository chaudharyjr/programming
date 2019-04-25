import java.util.*;
public class CF554B{
	
	public static void main(String [] Args){
		Scanner scan=new Scanner(System.in);
		int q=scan.nextInt();
		scan.nextLine();
		HashMap<String,Integer> hash_map=new HashMap<String,Integer>();
		String arr[]=new String[q];
		for (int i=0;i<q ;i++) {
			arr[i]=scan.nextLine();
		}
		for (int i=0;i<q ;i++) {
			if(!hash_map.containsKey(arr[i])){
				hash_map.put(arr[i],1);
			}else{
				int val=hash_map.get(arr[i])+1;
				hash_map.put(arr[i],val);
			}
		}
		//System.out.println(hash_map.size());
		int max=0;
		for(Map.Entry<String,Integer> entry:hash_map.entrySet()){
			max=Math.max(entry.getValue(),max);
		}
		System.out.println(max);
		//System.out.println(result);
	}	
}