public class program5 {
	
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public  boolean isEmpty() {
        return head == null;
    }
    public  void push(int data) {
            Node newNode = new Node(data);

            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        

        public  int pop() 
        {
            if(isEmpty()) 
            {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public  int peek() 
		{
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            return top;
        }
    

    public static void main(String args[]) {
        program5  stack = new program5();
        for(int i=1;i<=5;i++){
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}