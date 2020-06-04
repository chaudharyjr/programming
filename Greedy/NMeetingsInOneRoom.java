
import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.*;
class GFG{
	public static class Activity implements Comparable<Activity>{
		private int index;
		private int start;
		private int end;
		public Activity(int index,int start,int end){
			this.index=index;
			this.start=start;
			this.end=end;
		}
		public int compareTo(Activity u){
			if(this.end==u.end) return 0;
			return this.end < u.end ? -1 : 1;
		}

	}
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int testcase = 0; testcase < t ; ++testcase){
			int n = in.nextInt();
			int [] start=new int [n];
			int [] end=new int [n];
			ArrayList<Integer> result = new ArrayList<Integer>();
			PriorityQueue<Activity> schedule = new  PriorityQueue<Activity>();
			for(int i = 0; i < n; ++i){
				start[i]=in.nextInt();
			}
			for(int i = 0; i < n; ++i){
				end[i]=in.nextInt();
			}
			for(int i = 0; i < n; ++i){
				schedule.add(new Activity(i+1,start[i],end[i]));
			}
			Activity top=schedule.poll();
			result.add(top.index);
			while(schedule.size() != 0){
				Activity curr=schedule.poll();
				if(curr.start >= top.end){
					result.add(curr.index);
					top=curr;
				}
			}
			for(int i = 0 ; i < result.size() ; ++i){
				System.out.print(result.get(i) + " ");
			}
			System.out.println();
//			System.out.println(scan.next());	
		}
		
	}
}