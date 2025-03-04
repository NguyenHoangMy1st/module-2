package ss0_student_management.Model;

import java.util.Scanner;

public class StudentManager {


    // các method CRUD

    // hiển thị danh sách sinh viên

    private Scanner scanner = new Scanner(System.in);

    private static Student[] studentList = new Student[100];

    static {
        // khởi tạo dữ liệu mẫu
        studentList[0] = new Student(1, "Nguyễn Văn A");
        studentList[1] = new Student(2, "Nguyễn Văn B");
        studentList[2] = new Student(3, "Nguyễn Văn C");
    }

    public void display() {
        // đọc dữ liệu từ file hoặc từ database
        // giả lập
        System.out.println("===============================================");
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] == null) {
                break;
            }
            System.out.println(studentList[i]);
        }}

}
