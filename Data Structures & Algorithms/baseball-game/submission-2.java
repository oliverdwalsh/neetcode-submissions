class Solution {
    public int calPoints(String[] operations) {
        int output = 0;
        Stack<Integer> stack = new Stack<>();

        for(String op : operations){
            switch(op){
                case("C"):
                    stack.pop();
                    break;
                case("D"):
                    stack.push(stack.peek() * 2);
                    break;
                case("+"):
                    stack.push(stack.peek() + stack.get(stack.size() - 2));
                    break;
                default:
                    stack.push(Integer.valueOf(op));
            }   
        }


        for(int score : stack){
            output += score;
        }
        
        return output;
    }
}