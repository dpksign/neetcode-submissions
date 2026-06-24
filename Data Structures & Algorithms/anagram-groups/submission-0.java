class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            char [] strArr = str.toCharArray();
            Arrays.sort(strArr);
            
            String sortedS = new String(strArr);
            if(!map.containsKey(sortedS)) {
                map.put(sortedS, new ArrayList<String>());
                map.get(sortedS).add(str);
            }else{
                List<String> val = map.get(sortedS);
                val.add(str);
                map.put(sortedS, val);
            }
        }
        return new ArrayList<>(map.values());
        
    }
}
