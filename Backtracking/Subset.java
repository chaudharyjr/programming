class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<> ();
        List<Integer> tempList = new ArrayList<>();
        backtrack(nums,0,tempList,result);
        List<List<Integer>> res = result;
        return res;
    }
    
    public void backtrack(int [] nums,int start,List<Integer> tempList,List<List<Integer>> result){
            result.add(new ArrayList<>(tempList));
            for(int i = start ; i < nums.length ; ++i){
                tempList.add(nums[i]);
                backtrack(nums,i+1,tempList,result);
                tempList.remove(tempList.size()-1);
            }        
    }
}

