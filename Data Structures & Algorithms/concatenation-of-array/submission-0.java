class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int m=0;
        int[] ans = new int[2*n];
        for(int i : nums)
        {
            ans[m++]=i;
            ans[n++]=i;
        }
        return ans;
        
    }
}