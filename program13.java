public class program13 {
	
	public class Node {
		int data;
        Node next;
		Node prev;
        Node(int value){
            data=value;
            next=null;
			prev=null;
        }
	}
	Node head;
	Node tail;
	public void insert(int data) {
	Node new_node = new Node(data);
	if(head==null){
		head =tail = new_node;
	}
	else{
		tail.next=new_node;
		new_node.prev=tail;
		tail=new_node;
	}
	}
	public void delete(int key){
		if(head==null){
			System.out.println("The list is empty...cannot delete an element");
			return;
		}
		
	if(head.data==key)
	{
		if(head==tail)
		{
			head=tail=null;
			return;
		}
		head=head.next;
        head.prev=null;
		return;
	}
	Node temp =head;
	while(temp!=tail&&temp.next.data!=key)
	{
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
			temp.next.prev=temp;
		}
	}
	
	}

	public void printlist() {
	if(head==null){
		System.out.println("linkedlist is empty");
		return;
	}
	Node itr =head;
	while(itr!=null){
		System.out.print(itr.data+"<->");
		itr=itr.next;
		
	}
    System.out.println("Null");
	}
	public static void main(String[] args) {
		program13 dl = new program13();
		for(int i=1;i<11;i++){
            dl.insert(i);
        }
		dl.printlist();
		dl.delete(10);
		dl.printlist();
        
	}
}