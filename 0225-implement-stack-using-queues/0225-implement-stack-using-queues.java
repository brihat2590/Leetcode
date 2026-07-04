class MyStack {
    public ArrayDeque<Integer> q1;
    public ArrayDeque<Integer> q2;


    public MyStack() {
        q1=new ArrayDeque<Integer>();
        q2=new ArrayDeque<Integer>();
        
    }

    
    public void push(int x) {

        q2.offer(x);
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        ArrayDeque<Integer> temp=q1;
        q1=q2;
        q2=temp;
        //swap q1 and q2;


        
    }
    
    public int pop() {

        if(empty()){
            return -1;
        }
        return q1.poll();
        
    }
    
    public int top() {
        if(empty()){
            return -1;
        }
        return q1.peek();
        
    }
    
    public boolean empty() {

        if(q1.isEmpty()){
            return true;
        }
        else{
            return false;
        }
        
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