package ss10_dsa_danh_sach.linked_list_and_node;

public class MyLinkedList<E> {
    private Node<E> head;
    private int numNodes = 0;

    public MyLinkedList() {
        this.head = null;
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        numNodes++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if (head == null) {
            head = newNode;
        } else {
            Node<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        numNodes++;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        if (index == 0) {
            addFirst(element);
        } else {
            Node<E> newNode = new Node<>(element);
            Node<E> temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            numNodes++;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node<E> temp = head;
        if (index == 0) {
            head = head.next;
        } else {
            Node<E> prev = null;
            for (int i = 0; i < index; i++) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
        }
        numNodes--;
        return temp.data;
    }

    public boolean remove(E e) {
        Node<E> temp = head, prev = null;
        while (temp != null && !temp.data.equals(e)) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return false;
        if (prev == null) {
            head = temp.next;
        } else {
            prev.next = temp.next;
        }
        numNodes--;
        return true;
    }

    public int size() {
        return numNodes;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        Node<E> temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.equals(o)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + numNodes);
        }
        Node<E> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void printList() {
        Node<E> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
