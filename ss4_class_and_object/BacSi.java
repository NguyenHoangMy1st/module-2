package ss4_class_and_object;

public class BacSi {
    private int id;
    private String name;

    public BacSi() {}

    public BacSi(int id, String name) {
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

    public void khamBenh(BenhNhan benhNhan) {
        benhNhan.setStatus("Da duoc kham");
    }
}
