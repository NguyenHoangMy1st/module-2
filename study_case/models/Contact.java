package study_case.models;

public class Contact {
    private String phoneNumber, group, name, gender, address, birthDate, email;

    public Contact(String phoneNumber, String group, String name, String gender, String address, String birthDate, String email) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthDate = birthDate;
        this.email = email;
    }

    public String getPhoneNumber() { return phoneNumber; }
    public String getName() { return name; }
    public String toString() {
        return phoneNumber + ", " + group + ", " + name + ", " + gender + ", " + address + ", " + birthDate + ", " + email;
    }
}