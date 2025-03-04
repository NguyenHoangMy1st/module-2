package ss5_modifies;

public class Alumnus {

    private String name = "John";
    private String className = "CO2";

    public Alumnus() {}
    public Alumnus(String name, String className) {
        this.name = name;
        this.className = className;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    // Phương thức hiển thị thông tin
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Class: " + className);
    }


}
