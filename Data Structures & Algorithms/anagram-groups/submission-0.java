class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<List<Integer>, List<String>> aux = new HashMap<>();
        for(int i = 0; i < strs.length; i++) {
            aux.computeIfAbsent(getCountList(strs[i]), 
            k -> new ArrayList<>()).add(strs[i]);
        }
        for(List<String> list: aux.values()) {
            result.add(list);
        }
        return result;
    }

    private List<Integer> getCountList(String s) {
        int[] list = new int[26];
        for (int i = 0; i < s.length(); i++) {
            list[s.charAt(i) - 'a'] ++;
        }
        return Arrays.stream(list).boxed().toList();
    }
}
