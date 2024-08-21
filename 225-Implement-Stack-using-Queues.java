class MyStack {

    private Queue<Integer> q;

    // Constructor to initialize the stack
    public MyStack() {
        q = new LinkedList<>();
    }

    // Push element x onto stack
    public void push(int x) {
        q.add(x);
    }

    // Removes the element on top of the stack and returns that element
    public int pop() {
        int size = q.size();
        // Move elements to the back of the queue except the last one
        for (int i = 0; i < size - 1; i++) {
            q.add(q.remove());
        }
        return q.remove();  // The last element is the top of the stack
    }

    // Get the top element
    public int top() {
        int size = q.size();
        // Move elements to the back of the queue except the last one
        for (int i = 0; i < size - 1; i++) {
            q.add(q.remove());
        }
        int top = q.remove();  // The last element is the top of the stack
        q.add(top);  // Add it back after retrieving it
        return top;
    }

    // Returns whether the stack is empty
    public boolean empty() {
        return q.isEmpty();
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