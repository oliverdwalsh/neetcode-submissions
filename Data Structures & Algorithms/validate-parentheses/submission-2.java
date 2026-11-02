class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack(){};

        char[] charArray = s.toCharArray();

        for(char c : charArray){
            switch (c){
                case ('('):
                    stack.push(c);
                    break;
                case (')'):
                    if(stack.isEmpty() || !stack.peek().equals('(')){
                        return false;
                    }
                    stack.pop();
                    break;
                
                case ('{'):
                    stack.push(c);
                    break;
                case ('}'):
                    if(stack.isEmpty() || !stack.peek().equals('{')){
                        return false;
                    }
                    stack.pop();
                    break;
                
                
                case ('['):
                    stack.push(c);
                    break;
                case (']'):
                    if(stack.isEmpty() || !stack.peek().equals('[')){
                        return false;
                    }
                    stack.pop();
                    break;
            }
        }

        return stack.isEmpty();
    }

}
