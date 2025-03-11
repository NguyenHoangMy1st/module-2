package ss10_dsa_danh_sach.linked_list_and_node;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        // Thêm phần tử vào đầu danh sách
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);

        // Thêm phần tử vào cuối danh sách
        list.addLast(40);
        list.addLast(50);

        System.out.println("===================================");
        list.printList();
        System.out.println("===================================");

        // Thêm phần tử vào vị trí chỉ định
        list.add(2, 25);

        // In danh sách
        System.out.println("Danh sách sau khi thêm phần tử:");
        printList(list);

        // Xóa phần tử theo vị trí
        list.remove(3);
        System.out.println("Danh sách sau khi xóa phần tử ở index 3:");
        printList(list);

        // Xóa phần tử theo giá trị
        list.remove(Integer.valueOf(40));
        System.out.println("Danh sách sau khi xóa phần tử có giá trị 40:");
        printList(list);

        // Kiểm tra kích thước danh sách
        System.out.println("Kích thước danh sách: " + list.size());

        // Kiểm tra phần tử có tồn tại không
        System.out.println("Danh sách có chứa 25 không? " + list.contains(25));

        // Lấy phần tử theo index
        System.out.println("Phần tử ở index 50: " + list.indexOf(50));
    }

    public static void printList(MyLinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}