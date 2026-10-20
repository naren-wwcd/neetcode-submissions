class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        find(0,nums,target,ans,new ArrayList<>());
        return ans;
    }
    public void find(int ind,int[] arr,int t,List<List<Integer>> ans,List<Integer> list)
    {
        if(ind==arr.length)
        {
            if(t==0)
            {
                ans.add(new ArrayList<>(list));
               
            }
             return;
        }
        if(arr[ind]<=t)
        {
            list.add(arr[ind]);
            find(ind,arr,t-arr[ind],ans,list);
            list.remove(list.size()-1);
        }
        find(ind+1,arr,t,ans,list);

    }
}
