package ClassAndObject;

public class Main {
    public static void main(String[] args) {

        BenhNhan benhNhan1 = new BenhNhan();
        benhNhan1.setId(1);
        benhNhan1.setName("Nam");
        benhNhan1.setStatus("Chua duoc kham");
        BenhNhan benhNhan2 = new BenhNhan();
        benhNhan2.setId(2);
        benhNhan2.setName("Cuong");
        benhNhan2.setStatus("Chua duoc kham");

        System.out.println("ID: " + benhNhan1.getId() + ", Name: " + benhNhan1.getName() + ", Status: " + benhNhan1.getStatus());
        System.out.println("ID: " + benhNhan2.getId() + ", Name: " + benhNhan2.getName() + ", Status: " + benhNhan2.getStatus());

        BacSi bacSi1 = new BacSi(1, "Hoang");
        System.out.println("ID: " + bacSi1.getId() + ", Name: " + bacSi1.getName());

        bacSi1.khamBenh(benhNhan1);
        System.out.println("ID: " + benhNhan1.getId() + ", Name: " + benhNhan1.getName() + ", Status: " + benhNhan1.getStatus());
        System.out.println("ID: " + benhNhan2.getId() + ", Name: " + benhNhan2.getName() + ", Status: " + benhNhan2.getStatus());


    }
}
