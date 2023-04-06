class MyQueue {
    List<Integer> l = new ArrayList<Integer>();

    public MyQueue() {
    }
    
    public void push(int x) {
        l.add(x);
    }
    
    public int pop() {
        int temp = l.get(0);
        l.remove(0);
        return temp;
    }
    
    public int peek() {
        return l.get(0);
    }
    
    public boolean empty() {
        return l.isEmpty();
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
