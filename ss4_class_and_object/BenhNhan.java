package ss4_class_and_object;

public class BenhNhan {
    private int id;
    private String name;
    private String status;

    public static String language = "English";

    public static String getVersion(){
        return "1.1";
    }


    public BenhNhan() {}

    public BenhNhan(int id, String name, String status) {
        this.id = id;
        this.name = name;
        this.status = status;
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
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public static void phatQua(){
        System.out.println("Current verion: " + BenhNhan.language );
        System.out.println("Current verion: " + BenhNhan.getVersion() );
        System.out.println("Phat Qua Benh Nhan");
    }
}
