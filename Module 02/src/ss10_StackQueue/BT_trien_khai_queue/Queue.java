package ss10_StackQueue.BT_trien_khai_queue;

public class Queue<P> {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue (int value){
        Node temp = new Node(value);
        if (this.rear==null){
            this.front = this.rear = temp;
            return;
        }
        this.rear.link = temp;
        this.rear = temp;
    }

    public Node deQueue(){
        if (this.front == null){
            return null;
        }
        Node temp = this.front;
        this.front = this.front.link;
        if (this.front == null)
            this.rear = null;
            return temp;
    }
}
