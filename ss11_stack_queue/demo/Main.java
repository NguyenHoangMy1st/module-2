package ss11_stack_queue.demo;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // demo arraylist
        MyList<Employee> arraylist = new MyArrayList<Employee>();

        // Add elements to the arraylist
        arraylist.add(new Employee("An"));
        arraylist.add(new Employee("Binh"));
        arraylist.add(new Employee("Cuong"));

        Iterator<Employee> iterator = arraylist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        arraylist.remove(1);

        // demo linkedList
        MyLinkedList<Employee> linkedList = new MyLinkedList<Employee>();
        linkedList.addFirst(new Employee("Kien"));
        linkedList.addLast(new Employee("Minh"));
        linkedList.addLast(new Employee("Phu"));
        linkedList.addLast(new Employee("Cong"));
        linkedList.addLast(new Employee("Trung"));
        linkedList.addLast(new Employee("Luan"));
        linkedList.addLast(new Employee("T.Anh"));

        linkedList.add(3, new Employee("Dao"));

        System.out.println("End!");
    }
}
