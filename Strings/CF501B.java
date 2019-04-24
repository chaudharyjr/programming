import java.util.*;
public class CF501B{
	
	public static void main(String [] Args){
		Scanner scan=new Scanner(System.in);
		int q=scan.nextInt();
		String [] ques=new String[q];
		String[] first=new String[q];
		String[] second=new String[q];
		scan.nextLine();
		HashMap<String,String> hash_map=new HashMap<String,String>();
		for (int i=0;i<q ;i++) {
			ques[i]=scan.nextLine();
			String t[]=new String[2];
			t=ques[i].split(" ");
			first[i]=t[0];
			second[i]=t[1];
		}
		for (int i=0;i<q ;i++) {
			if(!hash_map.containsValue(first[i])){
				hash_map.put(first[i],second[i]);
			}else{
				String temp="";
				for(Map.Entry<String,String> entry:hash_map.entrySet()){
					if(entry.getValue().equals(first[i])){
						temp=entry.getKey();
						break;
					}
				}
				hash_map.put(temp,second[i]);
			}
		}
		System.out.println(hash_map.size());
		for(Map.Entry<String,String> entry:hash_map.entrySet()){
					System.out.println(entry.getKey()+" "+entry.getValue());
				}
		
	}	
}