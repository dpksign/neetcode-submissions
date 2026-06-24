class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int num : nums){
            if(!map.containsKey(num)) {
                map.put(num,1);
            }else{
                return true;    
            }
        }

        return false;
    }
}