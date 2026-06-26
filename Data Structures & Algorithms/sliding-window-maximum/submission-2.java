public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n - k + 1];
        Deque<Integer> dq = new LinkedList<>();

        int left = 0; int right =0;
        while(right < n) {

            while(!dq.isEmpty() && nums[dq.getLast()] < nums[right]) {
                dq.removeLast();
            }
            dq.addLast(right);

            if(left > dq.getFirst()) {
                dq.removeFirst();
            }
            if((right + 1) >= k){
                output[left] = nums[dq.getFirst()];
                left++;
            }

            right++;
        }    
        

        return output;
    }
}