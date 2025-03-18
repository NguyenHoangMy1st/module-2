package ss11_stack_queue.circular_queue;

public class CircularQueue {
    private Node front, rear;

    public CircularQueue() {
        this.front = this.rear = null;
    }

    // Thêm phần tử vào queue
    public void enQueue(int value) {
        Node newNode = new Node(value);

        if (front == null) {  // Nếu queue rỗng
            front = rear = newNode;
            rear.next = front; // Liên kết vòng
        } else {
            rear.next = newNode; // Liên kết rear với node mới
            rear = newNode;      // Cập nhật rear
            rear.next = front;   // Đảm bảo rear trỏ lại front
        }
    }

    // Loại bỏ phần tử khỏi queue
    public int deQueue() {
        if (front == null) { // Kiểm tra rỗng
            System.out.println("Queue rỗng!");
            return -1;
        }

        int value = front.data;

        if (front == rear) { // Chỉ có một phần tử
            front = rear = null;
        } else {
            front = front.next;  // Di chuyển front
            rear.next = front;   // Cập nhật rear trỏ lại front
        }

        return value;
    }

    // Hiển thị các phần tử trong queue
    public void displayQueue() {
        if (front == null) {
            System.out.println("Queue rỗng!");
            return;
        }

        Node temp = front;
        System.out.print("Queue: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println();
    }
}