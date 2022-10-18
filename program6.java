public class program6 {
    
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node front;
    Node rear;

    public boolean isEmpty(){
        return rear==null;
    }
    public void enque(int data){
        Node newnode=new Node(data);
        if(front==null){
            front=newnode;
            rear=newnode;

        }
        rear.next=newnode;
        rear=newnode;
    }
    public int deque(){
        if(front==null){System.out.println("queue if empty bro.....!");}
        int data=front.data;
        if(front==rear){
            front=null;
            rear=null;
            return data;
        }
        front=front.next;
        return data;
    }
    public int front(){
        return front.data;
    }
    public void print(){
        if(front==null){
            System.out.println("queue is empty bro.....!");
        }
        if(front==rear){System.out.println("there is only one element i.e...,"+front.data); return;}
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("NULL");
    } 
    public static void main(String[] args) {
        program6 q = new program6();
        for(int i=10;i<70;i=i+10){q.enque(i);}

        q.print();
        q.deque();
        q.print();
        System.out.println(q.front());
    }
    
}
