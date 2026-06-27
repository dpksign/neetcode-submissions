class Solution {
    public boolean isValid(String s) {

        Stack<Character> stackChar = new Stack<>();
        Map<Character, Character> keyValue = new HashMap<>();
        keyValue.put(')', '(');
        keyValue.put(']', '[');
        keyValue.put('}', '{');

        for(char c : s.toCharArray()) {
            if(keyValue.containsKey(c)){
                if(!stackChar.isEmpty() && stackChar.peek() == keyValue.get(c)){
                    stackChar.pop();
                }else{
                    return false;
                }
            }else{
                stackChar.push(c);
            }
        }
        return stackChar.isEmpty();


        
        
    }
}
