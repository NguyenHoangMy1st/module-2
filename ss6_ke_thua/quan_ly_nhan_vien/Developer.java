package ss6_ke_thua.quan_ly_nhan_vien;

public class Developer extends Employee{
    private String programmingLanguage;
    public Developer(String name,
                     String id,
                     double salary,
                     String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }
}