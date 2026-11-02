class Solution {
    public int calPoints(String[] operations) {
        int output = 0;
        Stack<Integer> stack = new Stack<>();

        for(String op : operations){
            if("C".equals(op)){
                stack.pop();
            }else if("D".equals(op)){
                stack.push(stack.peek() * 2);
            }else if("+".equals(op)){
                stack.push(stack.peek() + stack.get(stack.size() - 2));
            }
            else{
                stack.push(Integer.valueOf(op));
            }
        }

        System.out.println(stack.toString());
        
        for(int i = 0; i < stack.size() ; i ++){
            output = output + stack.get(i);
        }
        return output;
    }
}