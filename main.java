public class Main {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);

        queue.enqueue(10.5);
        queue.enqueue(20.3);
        queue.enqueue(30.7);
        queue.enqueue(40.1);
        queue.enqueue(50.9);

        queue.enqueue(99.9);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        queue.display();
    }
}
