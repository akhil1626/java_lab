public class program28 {
    
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    static class Binary{
        static int i=-1;
        Node insert(int arr[]){
            i++;
            if(arr[i]==-1){
                return null;
            }
            Node root=new Node(arr[i]);
            root.left=insert(arr);
            root.right=insert(arr);
            return root;
        }
    }
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void preorder(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if (root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }         

    public static void main(String[] args) {
        int arr[]={5,8,3,6,-1,-1,4,-1,-1,1,-1,-1,2,9,-1,-1,7,-1,-1};
        Binary o=new Binary();
        Node root=o.insert(arr);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);

    }
}
