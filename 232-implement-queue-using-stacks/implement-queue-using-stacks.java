class MyQueue {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }
    
    // Pushes element x to the back of the queue
    public void push(int x) {
        inStack.push(x);
    }
    
    // Removes the element from the front of the queue and returns it
    public int pop() {
        move();
        return outStack.pop();
    }
    
    // Returns the element at the front of the queue
    public int peek() {
        move();
        return outStack.peek();
    }
    
    // Returns true if the queue is empty, false otherwise
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
    
    // Helper method to move elements from inStack to outStack when outStack is empty
    private void move() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */