import java.util.Scanner;
public class program7 {
    int size;
    int arr[];
    int rear=-1;
    program7(int data){
        this.size=data;
        this.arr=new int[data];
    }
    
    public boolean isEmpty(){
        return rear==-1;

    }
    public boolean isFull(){
        return (rear>=size);
    }
    public void enque( int data){
        if(isFull()){
            System.out.println("array is full ....u cannot inset now ");
        }
        rear++;
        arr[rear]=data;
    }
    public int deque(){
        if(isEmpty()){
            System.out.println("queue is empty.....");
        }
        int data=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return data;
        
    }
    public int frontt(){
        if(isEmpty()){
            System.out.println("nothing in the queue");
        }
        return arr[0];
    }
    public void print(){
        for(int i=0;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) 
    {
    System.out.println("enter the size of the array");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    program7 q=new program7(n);
    for(int i=10;i<=60;i=i+10){
        q.enque(i);
    }
    q.print();
    q.deque();
    q.print();
    System.out.println("the front is "+q.frontt());
    sc.close();

}
}
