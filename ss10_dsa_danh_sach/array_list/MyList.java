package ss10_dsa_danh_sach.array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }


    //Mục đích: Tăng gấp đôi kích thước mảng chứa các phần tử
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newSize = Math.max(elements.length * 2, minCapacity);
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    //Mục đích: thêm một phần tử vào cuối của danh sách
    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(size + 1);
        }
        elements[size++] = e;
        return true;
    }

    //Mục đích: Chèn một phần tử element vào vị trí index
    public void add(int index, E element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity(size + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    //Mục đích: Trả về phần tử tại vị trí i. Nếu i không hợp lệ, nó sẽ ném ra ngoại lệ IndexOutOfBoundsException
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }
        return (E) elements[i];
    }

    //Mục đích: Xóa phần tử tại index, dịch chuyển các phần tử sau nó về phía trước. Trả về phần tử bị xóa
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E removedElement = (E) elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = null;
        return removedElement;
    }

    //Mục đích: Trả về số phần tử hiện có trong danh sách.
    public int size() {
        return size;
    }


    //Xóa toàn bộ phần tử trong danh sách bằng cách đặt tất cả về null và đặt size = 0.
    public void clear() {
        Arrays.fill(elements, 0, size, null);
        size = 0;
    }

    //Kiểm tra xem danh sách có chứa phần tử o không. Trả về true nếu có, ngược lại trả về false.
    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    //Trả về chỉ số (index) đầu tiên của phần tử o trong danh sách. Nếu không tìm thấy, trả về -1.
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    //Tạo một bản sao của danh sách hiện tại và trả về bản sao đó.
    public MyList<E> clone() {
        MyList<E> clone = new MyList<>(size);
        System.arraycopy(this.elements, 0, clone.elements, 0, size);
        clone.size = this.size;
        return clone;
    }
}
