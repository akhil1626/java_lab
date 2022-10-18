public class program27 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }

    }
    public static Node non_rec_insert(Node root,int data){
        Node current=root;
        Node parent=null;
        if(root==null)
        {
            return root=new Node(data);
        }
        while(current!=null){
            parent=current;
            if(data<current.data){
                current=current.left;
            }
            else{
                current=current.right;
            }
            
        }
        if(data<parent.data){
            parent.left=new Node(data);
        }
        else{
            parent.right=new Node(data);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    
    }
    public static void rec_search(Node root,int key){
        if(root==null){
            System.out.println("key not found");
        }
        else if(key==root.data){
            System.out.println("elment found in bst");
        }
        else if(key<root.data){
            rec_search(root.left, key);
        }
        else{
            rec_search(root.right, key);
        }
    }
    public static void search(Node root,int key){
        
        
        while(root!=null){
            if(key==root.data){
                System.out.println("key found in bst");
                break;
            }
            else if(key<root.data){
                root=root.left;
            }
            else{
                root=root.right;
            }
        }
        if(root==null){
            System.out.println("key not found");
        }
    }
        
    
    public static void main(String[] args) {
        int arr[]={5,4,3,8,7};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=non_rec_insert(root, arr[i]);
        }
        inorder(root);
        rec_search(root, 2);
        System.out.println();
        search(root, 41);

    }
}
