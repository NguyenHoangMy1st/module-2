package ss5_modifies;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BBDIT"; //Thuộc tính tĩnh

    // Constructor để khởi tạo biến
    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    //Phương thức tĩnh thay đổi giá trị biến
    static void change(){
        college = "CodeGym";
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
