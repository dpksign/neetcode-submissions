class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            for(int i=left+1 ;i <numbers.length ; i++) {
                if(numbers[left] + numbers[i] == target) {
                    return new int[]{left+1,i+1};
                }
            }
            left++;
        }
        return new int[]{0,0};
    }
}
//[6,7,10,15,36]