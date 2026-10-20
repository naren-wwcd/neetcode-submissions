class Solution {
    public void sortColors(int[] nums) {
        int s=0;
        int m=0;
        int e=nums.length-1;
        while(m<=e)
        {
            if(nums[m]==0)
            {
                swap(nums,s,m);
                s++;
                m++;
            }
            else if(nums[m]==2)
            {
                swap(nums,m,e);
                e--;
            }
            else
            {
                m++;
            }
        }
        
    }
    public void swap(int[] n,int a,int b)
    {
            int temp=n[a];
            n[a]=n[b];
            n[b]=temp;
    }
}