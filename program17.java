public class program17 {
    Node head;
    Node tail;
    class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        
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
            tail = new_node;
        }
    }
    public int deque_first()
    {
        if(isEmpty())
        {
            System.out.println("Empty Deque....");
            return 0;
        }
		int temp=head.data;
    	head = head.next;
		return temp;
        
    }

    public int deque_last()
    {
        if(isEmpty())
        {
            System.out.println("Empty Deque....");
            return 0;
        }
        else{
            Node prev = head;
            Node last = head.next;
            while (last.next!=null)
            {
                last = last.next;
                prev = prev.next;
            }
            int temp=last.data;
            prev.next = null;
            tail = prev;
            return temp;
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
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
        }

    }

    public static void main(String[] args) {
        program17 dq = new program17();
        dq.enque_first(3);
        dq.enque_first(2);
        dq.enque_first(1);
        dq.print_list();
        dq.enque_last(4);
        dq.enque_last(5);
        dq.enque_last(6);
        dq.print_list();
        dq.deque_first();
        System.out.println(dq.deque_last());
        dq.print_list();
    }
}