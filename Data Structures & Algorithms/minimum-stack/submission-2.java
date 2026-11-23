class MinStack {

    Integer min;
    List<Integer> stack;
    List<Integer> minStack;
    int size;

    public MinStack() {
        this.min = Integer.MAX_VALUE;
        stack = new ArrayList<>();
        minStack = new ArrayList<>();
        size = 0;
    }
    
    public void push(int val) {
        size++;
        if (val < min) {
            min = val;
        }
        stack.add(size - 1, val);
        minStack.add(size - 1, min);
    }
    
    public void pop() {
        size--;
        Integer removed = stack.remove(size);
        Integer minRemoved = minStack.remove(size);
        min = (size == 0) ? Integer.MAX_VALUE : minStack.get(size - 1);
    }
    
    public int top() {
        return stack.get(size - 1);
    }
    
    public int getMin() {
        return minStack.get(size - 1);
    }
}
