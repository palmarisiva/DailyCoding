class Node{
     int data;
     Node next;
    public Node(int d){
        data = d;
        next = null;
    }
}
class StackLinked{
    Node front;

    public void push_s(int d){
        if(front == null){
            front  = new Node(d);
            return;
        }
        Node node = new Node(d);
        node.next = front;
        front = node;
    }
    public int pop_s(){
        Node node = null;
        if(front == null)
        {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        node = front;
        front = node.next;
        return node.data;
    }
}
public class StackLinkedImplementation {
    public static void main(String args[]){

    StackLinked al = new StackLinked();
    al.push_s(3);
    al.push_s(5);
    System.out.println(al.pop_s());
    System.out.println(al.pop_s());
}


}
