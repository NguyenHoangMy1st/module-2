package ss11_stack_queue.circular_queue;

public class CircularQueueDemo {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enQueue(14);
        queue.enQueue(22);
        queue.enQueue(-6);
        queue.displayQueue();

        queue.deQueue();
        queue.displayQueue();

        queue.deQueue();
        queue.displayQueue();

        queue.enQueue(9);
        queue.enQueue(20);
        queue.displayQueue();
    }
}
