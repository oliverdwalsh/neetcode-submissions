class MyStack {

    Deque queueOne;

    public MyStack() {
        this.queueOne = new ArrayDeque<>();
    }
    
    public void push(int x) {
        queueOne.addLast(x);
    }
    
    public int pop() {
        return (int) queueOne.removeLast();
    }
    
    public int top() {
        return (int) queueOne.peekLast();        
    }
    
    public boolean empty() {
        return queueOne.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */