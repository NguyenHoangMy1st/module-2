package ss10_dsa_danh_sach.array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("List size: " + list.size());
        System.out.println("Element at index 2: " + list.get(2));

        list.add(2, 99);
        System.out.println("Element at index 2 after insertion: " + list.get(2));

        System.out.println("Removing element at index 3: " + list.remove(3));
        System.out.println("List size after removal: " + list.size());

        System.out.println("Contains 99? " + list.contains(99));
        System.out.println("Index of 99: " + list.indexOf(99));

        MyList<Integer> clonedList = list.clone();
        System.out.println("Cloned list size: " + clonedList.size());

        list.clear();
        System.out.println("List size after clear: " + list.size());
    }
}
