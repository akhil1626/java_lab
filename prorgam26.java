public class prorgam26 {
    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            
        }
    }
    public static Node rec_insertion(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data<root.data){
            root.left=rec_insertion(root.left, data);
        }
        else{
            root.right=rec_insertion(root.right, data);
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
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,6,8,9,7,10};
        Node root=null;
        for(int i=0;i<arr.length;i++)
        {
            root=rec_insertion(root, arr[i]);
        }
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }

}
