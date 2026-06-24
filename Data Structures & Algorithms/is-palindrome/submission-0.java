class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println("String :"+s1);
        char [] arr = s1.toCharArray();
        int left = 0;
        int right= s1.length() -1;

        while(left <= right ) {
            if(arr[left] == arr[right]) {
                left++;
                right--;
            }else{
                return false;
            }
        }

        return true;

    }
}
