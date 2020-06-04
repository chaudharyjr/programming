
class CompareByFirst implements Comparator<Pair>
{
   public int compare(Pair a, Pair b)
    {
        return a.x - b.x;
    }
}

class MaximumChainLength
{
    int maxChainLength(Pair arr[], int n)
    {
            Arrays.sort(arr, new CompareByFirst());
            int answer = 1;
            int [] dp = new int [n];
			for (int i = 0; i < n ; ++i) {
			    dp[i] = 1;
				for(int j = 0 ; j < i; ++j){
				    if(arr[i].x -arr[j].y > 0){
				        dp[i] = Math.max(dp[i],dp[j]+1);
				        answer = Math.max(dp[i],answer);
				    }
				}
			}
			return answer;
			
    }
}