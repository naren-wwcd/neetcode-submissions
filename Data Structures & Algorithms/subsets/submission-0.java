class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        find(0,nums,ans,new ArrayList<>());
        return ans;
    }
    public void find(int ind,int[] arr,List<List<Integer>> ans,List<Integer> list)
    {
        if(ind==arr.length)
        {
            ans.add(new ArrayList<>(list));
            return;
        }

        find(ind+1,arr,ans,list);
        list.add(arr[ind]);
        find(ind+1,arr,ans,list);
        list.remove(list.size()-1);
    }
}
