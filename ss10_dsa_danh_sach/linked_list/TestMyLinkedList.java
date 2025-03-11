package ss10_dsa_danh_sach.linked_list;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);    //11 10
        ll.addFirst(12);    //12 11 10
        ll.addFirst(13);    //13 12 11 10

        ll.add(4,9);  //13 12 11 10 9
        ll.add(4,9);  //13 12 11 10 9 9
        ll.printList();
    }
}