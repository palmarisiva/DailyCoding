import java.util.Currency;

public class QueueDemo<Integer> {
    Node<Integer> front;
    Node<Integer> rear;
    int length;
    public void enqueue(Integer data){
        if(front == null){
            front = new Node<Integer>(data);
            rear = front;
            length++;
            return;
        }
        rear.next = new Node<Integer>(data);
        rear = rear.next;
        length++;
    }
    public Integer dequeue(){
       Integer result = null;
        if(front !=null){
            result = front.data;
            front = front.next;
            length--;
        }
return result;
    }
    public int size(){
        return length;
    }
    public void display(){
       Node currentNode = front;
       while(currentNode != null){
           System.out.println(currentNode.data);
           currentNode = currentNode.next;
       }
    }
    private static class Node<Integer> {
        private final Integer data;
        private Node<Integer> next;
        Node(Integer d){
            super();
            data = d;
            this.next = null;
        }
    }
 public static void main(String args[]){
        QueueDemo q1 = new QueueDemo();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        System.out.println("size "+q1.size());
        q1.display();
 }
}

