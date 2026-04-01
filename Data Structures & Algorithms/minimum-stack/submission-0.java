class MinStack {

    private ArrayDeque<Integer> stack;
    private ArrayDeque<Integer> minStack;

    public MinStack() {
       stack = new ArrayDeque<Integer>();
       minStack = new ArrayDeque<Integer>();
    }
    
    public void push(int val) {
       stack.push(val);
       val = Math.min(val, minStack.isEmpty()? val : minStack.peek());
       minStack.push(val);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
