package ss6_ke_thua.quan_ly_nhan_vien;


public class Manager extends Employee{
    private final double bonus;
    public Manager(String name,
                   String id,
                   double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return super.getSalary() + super.getSalary()/100 * bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                '}';
    }
}