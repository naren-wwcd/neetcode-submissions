class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0)
        {
            return new ArrayList<>();
        }
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            String f=get(s);
            
            if(map.containsKey(f))
            {
                List<String> m=map.get(f);
                m.add(s);
            }
            else
            {
                List<String> m=new ArrayList<>();
                m.add(s);
                map.put(f,m);
            }

        }
        return new ArrayList<>(map.values());
    }
    public String get(String s)
    {
        StringBuilder sb=new StringBuilder();

        int[] arr=new int[26];

        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            sb.append(arr[i]).append("#");
        }
        return sb.toString();
    }
}
