public class program18 {
    Node head;
    Node tail;
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }
    public boolean isEmpty()
    {
        return head==null;
    }
    public void enque_first(int value)
    {
        Node new_node = new Node(value);
        if(isEmpty()){
            head = new_node;
            tail = new_node;
        }
        else {
            new_node.next = head;
            head.prev = new_node;
            head = new_node;
        }
    }
    public void enque_last(int value)
    {
        Node new_node = new Node(value);
        if(isEmpty()){
            head = new_node;
            tail = new_node;
        }
        else {
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
        }
    }
    public void deque_first()
    {
        
        if(isEmpty())
        {
            System.out.println("Empty Deque....");
            return;
        }        
        head = head.next;
		head.prev=null;
        
        
    }

    public void deque_last()
    {
        if(isEmpty())
        {
            System.out.println("Empty Deque....");
            return;
        }
        else{
            Node prev = head;
            Node last = head.next;
            while (last.next!=null)
            {
                last = last.next;
                prev = prev.next;
            }
            prev.next = null;
            tail = prev;
        }
        
    }
    public void print_list()
    {
        if(isEmpty())
        {
            System.out.println("Empty Deque..");
        }
        else{
            Node temp=head;
			while(temp!=null){
				System.out.print(temp.data+"<-> ");
				temp=temp.next;
			}
			System.out.println("Null");
        }

    }

    public static void main(String[] args) {
        program18 dq = new program18();
        dq.enque_first(3);
        dq.enque_first(2);
        dq.enque_first(1);
        dq.enque_last(4);
        dq.enque_last(5);
        dq.enque_last(6);
        dq.print_list();
        dq.deque_first();
		dq.print_list();
        dq.deque_last();
		dq.print_list();
    }
}