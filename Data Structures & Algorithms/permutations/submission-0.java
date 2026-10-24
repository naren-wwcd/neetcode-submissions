class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> ans=new ArrayList<>();
         find(0,nums,ans);
         return ans;
    }
    public void find(int ind,int[] arr, List<List<Integer>> ans)
    {
        if(ind==arr.length)
        {
            List<Integer> list =new ArrayList<>();
            for(int i:arr)
            {
                list.add(i);
            }
            ans.add(list);
            return;
        }

        for(int i=ind;i<arr.length;i++)
        {
            swap(i,ind,arr);
            find(ind+1,arr,ans);
            swap(i,ind,arr);
        }
    }
    public void swap(int i,int j,int[] arr)
    {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}
