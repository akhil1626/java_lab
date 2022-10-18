public class program19 {
	Node head;
    public class Node {
        int data;
        Node next;
		Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
			this.prev=null;
        }
    }

       
        public  void push(int data) {
            Node newNode = new Node(data);

            if(isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
			head=newNode;
        }

        public  boolean isEmpty() {
            return head == null;
        }

        public  int pop() {
            if(isEmpty()) {
                return 0;
            }
			 int top = head.data;
             head.prev=null;
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
        program19  s = new program19();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}