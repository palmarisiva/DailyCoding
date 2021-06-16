class Node{
    int data;
    Node left;
    Node right;
    public Node(int d){
        data =d;
        left = null;
        right =null;
    }
}
 class BST{

    public Node createNewNode(int data){
        Node a = new Node(data);
        a.data = data;
        a.right = null;
        a.left = null;
        return a;
    }
    public Node insert(Node node,int data){
        Node n = null;
        if(node == null){
            n = createNewNode(data);
            return n;
        }
        if(data < node.data){
            node.left = insert(node.left, data);
        } else{
            node.right = insert(node.right, data);
        }
        return n;
    }

}

public class BSTDemo {
    public static void main(String args[]){
             Node root = null;
             BST bst = new BST();
             //8,3,6,10,4,7,1,14,13
            root = bst.insert(root, 8);
            root = bst.insert(root,3);
        root = bst.insert(root, 6);
        root = bst.insert(root,10);
        root = bst.insert(root, 4);
        root = bst.insert(root,7);
        root = bst.insert(root, 1);
        root = bst.insert(root,14);
        root = bst.insert(root,13);
    }
}
