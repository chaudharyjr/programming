import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SuffixArray
{
    public static int [] sortCharacters(String s){
    	char[] arr=s.toCharArray();
    	int [] count=new int[26];
    	int [] order=new int[s.length()];
    	for(char c:arr){
    		count[c-'a']++;
    	}
    	for(int i=1;i<s.length();i++){
    		count[i]+=count[i-1];
    	}
    	for(int i=s.length()-1;i>=0;i--){
    		count[arr[i]-'a']-=1;
    		order[count[arr[i]-'a']]=i;
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
