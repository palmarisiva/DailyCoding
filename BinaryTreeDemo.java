class Node{
    int data;
    Node left;
    Node right;
}
class BinaryTree {
    public Node createNewNode(int k){
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right =null;
        return a;
    }

}
public class BinaryTreeDemo{
    public static void main(String args[]){
        BinaryTree bt = new BinaryTree();
        Node root = bt.createNewNode(2);
        root.left = bt.createNewNode(7);
        root.right = bt.createNewNode(5);
        root.left.left = bt.createNewNode(6);
        root.left.right = bt.createNewNode(1);
        root.left.right.left = bt.createNewNode(4);
        root.left.right.right = bt.createNewNode(8);
        root.right.right = bt.createNewNode(3);
        root.right.right.left = bt.createNewNode(9);

        System.out.println("In Order");
        inorder(root);
        System.out.println();
        System.out.println("Pre Order");
        preorder(root);
        System.out.println();
        System.out.println("Post Order");
        postorder(root);
        System.out.println();



    }
    public static void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }
    public static void preorder(Node root){
        if(root == null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root){
        if(root ==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }


}
