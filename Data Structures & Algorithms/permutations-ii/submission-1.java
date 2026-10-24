class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        find(0,nums,ans);
        return ans;
    }
    public void find(int ind,int[] arr,List<List<Integer>> ans)
    {
        if(ind==arr.length)
        {
            List<Integer> list=new ArrayList<>();
            for(int i:arr)
            {
                list.add(i);
            }
            ans.add(list);
            return;
        }

        Set<Integer> set=new HashSet<>();

        for(int i=ind;i<arr.length;i++)
        {
            if(set.contains(arr[i]))
            {
                continue;
            }
            set.add(arr[i]);
            swap(ind,i,arr);
            find(ind+1,arr,ans);
            swap(ind,i,arr);
        }
    }
    public void swap(int i,int j,int[] arr)
    {
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
}