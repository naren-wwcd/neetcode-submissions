class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        Arrays.sort(c);
        List<List<Integer>> ans = new ArrayList<>();
        find(0, c, t, ans, new ArrayList<>());
        return ans;
    }
    public void find(int ind, int[] arr, int t, List<List<Integer>> ans, List<Integer> list) {
        if (t == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = ind; i < arr.length; i++) {
            if (i > ind && arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] > t) {
                break;
            }
            list.add(arr[i]);
            find(i + 1, arr, t - arr[i], ans, list);
            list.remove(list.size() - 1);
        }
    }
}
