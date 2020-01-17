import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SuffixArray
{
    public static int charToIndex(char x) {
	if(x == '$')
	   return 0;
	return x-'a'+1;
    }
		
    public static int [] sortCharacters(String s){
    	char[] arr=s.toCharArray();
    	int [] count=new int[27];
    	int [] order=new int[s.length()];
    	for(char c:arr){
    		count[charToIndex(c)]++;
    	}
    	for(int i=1;i<count.length();i++){
    		count[i]+=count[i-1];
    	}
    	for(int i=s.length()-1;i>=0;i--){
    		count[charToIndex(arr[i])]-=1;
    		order[count[charToIndex(arr[i])]]=i;
    	}
    	return order;
    }
    
    public static int [] computeCharClasses(String s, int[] order){
    	char[] arr=s.toCharArray();
    	int [] classes=new int[s.length()];
    	classes[order[0]]=0;
    	for(int i=1;i<s.length();i++){
    		if(arr[order[i]]==arr[order[i-1]]){
    			classes[order[i]]=classes[order[i-1]];
    		}else{
    			classes[order[i]]=classes[order[i-1]]+1;
    		}
    	}
    	return classes;
    }
    
     public static int [] sortDoubled(String s,int l,int [] order,int [] class){
     		int [] newOrder=new int[s.length()];
		    int [] count=new int[s.length()];
		    for(int i=0;i<class.length();i++){
			    count[class[i]]+=1;
		    }
	    	for(int i=1;i<s.length();i++){
	    		count[class[i]]+=count[class[i-1]];
	    	}
	    	for(int i=s.length()-1;i>=0;i--){
	    		int start=(order[i]-l+s.length())%s.length();
	    		int cl=class[start];
	    		count[cl]-=1;
	    		newOrder[count[cl]]=start;
	    	}
	    	return newOrder;	
    }


    public static int [] updateClass(int n,int l,int [] newOrder,int [] class_old){
	int [] newClass=new int[n];
	int [] count=new int[n];
	newClass[newOrder[0]]=0;
    	for(int i=1;i<n;i++){
    		int curr=newOrder[i];
    		int prev=newOrder[i-1];
    		int curr_mid=(newOrder[i]+l)%newOrder.length();
    		int prev_mid=(newOrder[i-1]+l)%newOrder.length();
    		if(class_old[curr]!=class_old[prev] || class_old[curr_mid]!=class_old[prev_mid]){
    			newClass[curr]=newClass[prev]+1;
    		}else{
    			newClass[curr]=newClass[prev];
    		}
    	}
    	return newClass;
    }

    /*
    vector<int> BuildSuffixArray(const string& text) {
  vector<int> result;
  // Implement this function yourself
  vector<int> order(text.size());
  counting_sort_char(text, order);

  vector<int> sort_class(text.size());
  compute_class(text, order, sort_class);

  for (int l = 1; l <= text.size(); l *= 2) {
    order = sort_double(text, l, order, sort_class);
    sort_class = update_class(order, sort_class, l);
  }

  return order;
} 
*/

  
	public static void main (String[] args) throws java.lang.Exception
	{
		int [] pos=sortCharacters("bcdefghi");
		for(Integer i : pos){
		    System.out.println(pos[i]+1);
		}
		int [] classes=computeCharClasses("bcdefghia",pos);
		
		for(Integer i : classes){
		    System.out.println(classes[i]);
		}
	}
}
