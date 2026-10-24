class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        find(1,n,k,ans,new ArrayList<>());
        return ans;

    }
    void find(int i,int n,int k,List<List<Integer>> ans,List<Integer> list)
    {
        if(list.size()==k)
        {
            ans.add(new ArrayList<>(list));
            return ;
        }

        for(int j=i;j<=n;j++)
        {
            list.add(j);
            find(j+1,n,k,ans,list);
            list.remove(list.size()-1);
        }
    }
}