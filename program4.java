public class program4 
{
    int size;
    int arr[];
    int top=-1;
    program4(int data){
        this.size=data;
        this.arr=new int[size];


    }    
    public boolean isEmpty()
    {
        return(top==-1);
    }
    boolean isFull()
    {
        return (top>=size);
    }
    public void push(int val)
    {
        if(!isFull())
        {
            arr[++top]=val;
        }
        else {
            System.out.print("Stack OverFlow");
        }
    }
    public int pop()
    {
        int x=0;
        if(!isEmpty())
        {
            x =  arr[top--];
        }
        else{System.out.print("Empty Stack....");}
        return x;
    }
    public void print_array()
    {
        if(!isEmpty()){
            System.out.print("Stack Elements  -> ");
            for(int i=0;i<=top;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        else{
            System.out.print("Stack Empty....");
        }
        System.out.println();
    }
    public void print_array_reverse()
    {
        if(!isEmpty()){
        System.out.print("Stack Elements In Reverse Order -> ");
        for(int i=top;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        }
        else{
            System.out.print("Stack Empty....");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        program4 stack = new program4(10);
        // int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(stack.isEmpty());
        for(int i=1;i< 11;i++){
        stack.push(i);}
        System.out.print("Before Deletion  ");
        stack.print_array();
        System.out.print("After Deletion  ");
        stack.pop();
        stack.print_array();
        stack.print_array_reverse();
    }
}