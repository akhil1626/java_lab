public class program3 {
	
	public class Node{
		int data;
		Node next;
		Node(int elem){
			this.data = elem;
			this.next = null;
		}
	}
	Node head;
	Node tail;
	public void insert(int data) 
	{
		Node t = new Node(data);
		if(head == null){
			head  = t;
			tail = t;
		}
		else{
			tail.next = t;
			tail = t;
		}
	}
	public void delete(int key){
		if(head == null){
			System.out.println("the list is empty...");

		}
		if(head.data == key){
			if(head==tail){
				head = tail = null;
				System.out.println("the list is now empty...");
				return;
			}
			else{
				head = head.next;
		        return;
			}
		}
        Node temp=head;
        while(temp!=tail&&temp.next.data!=key){
            temp=temp.next;
        }
		
        if(temp==tail)
		{
            System.out.println("element not found......!");
			return;
        }
		else
		{
			if(temp.next==tail)
			{
				temp.next=null;
				tail=temp;
			}
			else 
			{
        	temp.next=temp.next.next;
			}
		}
		
		
	}
	public void print() {
		Node itr=head;
		while(itr!=null){
			System.out.print(itr.data + " ");
			itr = itr.next;
		}
        System.out.println();
	}
	public static void main(String[] args) {
		program3 l = new program3();
		for(int i=1;i<2;i++){
            l.insert(i);
        }
        l.print();
		l.delete(1);
        l.print();
	}
}
