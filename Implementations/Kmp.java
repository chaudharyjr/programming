import java.util.*;
import java.lang.*;
import java.io.*;

class Kmp
{
    /*
    *
    s[i] denotes the longest border i.e, same prefix and suffix of arr[0..i]
    *
    */
    public static int [] prefixFunction(String arr){
	    char [] P=arr.toCharArray();
	    int [] s=new int[arr.length()];
	    s[0]=0;
	    int border=0;
	    for(int i=1;i<s.length;i++){
		    while(border>0 && P[i]!=P[border]){
			    border=s[border-1];
		    }
		    if(P[i]==P[border]){
			    border=border+1;
		    }else{
			    border=0;
		    }
		    s[i]=border;
	    }
	    return s;
    }

    public static ArrayList<Integer> KMP(String text,String pattern){
    	ArrayList<Integer> res=new ArrayList<Integer>();
    	int [] pF=new int [pattern.length()+text.length()+1];
    	pF=prefixFunction(pattern+"$"+text);
    	for(int i=pattern.length()+1;i<=pF.length-1;i++){
    		if(pF[i]==pattern.length()){
    			res.add(i-2*pattern.length());
    		}
    	}
    	return res;
    }
  
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String text="ababacabab";
		String pattern="abab";
		ArrayList<Integer> res=KMP(text,pattern);
		for(Integer i : res){
		    System.out.println(text.substring(i,pattern.length()));
		}
	}
}
