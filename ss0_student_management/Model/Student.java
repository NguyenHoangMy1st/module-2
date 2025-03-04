package ss0_student_management.Model;

public class Student {
    private  int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //Object
    @Override
    public String toString() {
        return "Sinh vien{"
                + "id: " + id
                + " , name " + name + '\'' +
                '}';
    }
}
