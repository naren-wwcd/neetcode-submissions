class Solution {
    public int maxArea(int[] h) {
        int i=0,j=h.length-1;
        int cm=0,max=0;
        while(i<j)
        {
            cm=Math.min(h[i],h[j])*(j-i);
            max=max>cm?max:cm;
            if(h[i]>h[j])
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        return max;
    }
}
