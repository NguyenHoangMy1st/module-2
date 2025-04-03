package case_study.models;

import java.util.regex.Pattern;

public class PhoneBook {
    private String phoneNumber, group, name, gender, address;

    public PhoneBook(String phoneNumber, String group, String name, String gender, String address) {
        setPhoneNumber(phoneNumber);
        setGroup(group);
        setName(name);
        setGender(gender);
        setAddress(address);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (isValidPhoneNumber(phoneNumber)) {
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Lỗi: Số điện thoại không hợp lệ. (Phải có 10 chữ số và bắt đầu bằng 0)");
            this.phoneNumber = "Không hợp lệ"; // Hoặc giá trị mặc định khác
        }
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        if (group != null && !group.trim().isEmpty()) {
            this.group = group;
        } else {
            System.out.println("Lỗi: Nhóm không được để trống.");
            this.group = "Không xác định"; // Hoặc giá trị mặc định khác
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Lỗi: Tên không được để trống.");
            this.name = "Không xác định"; // Hoặc giá trị mặc định khác
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender != null && !gender.trim().isEmpty()) {
            this.gender = gender;
        } else {
            System.out.println("Lỗi: Giới tính không được để trống.");
            this.gender = "Không xác định"; // Hoặc giá trị mặc định khác
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && !address.trim().isEmpty()) {
            this.address = address;
        } else {
            System.out.println("Lỗi: Địa chỉ không được để trống.");
            this.address = "Không xác định"; // Hoặc giá trị mặc định khác
        }
    }

    public String toCSV() {
        return phoneNumber + "," + group + "," + name + "," + gender + "," + address;
    }

    public static PhoneBook fromCSV(String csvLine) {
        String[] tokens = csvLine.split(",");
        if (tokens.length == 5) {
            PhoneBook phoneBook = new PhoneBook(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4]);
            if (phoneBook.getPhoneNumber().equals("Không hợp lệ")) {
                System.out.println("Lỗi: Dữ liệu CSV chứa số điện thoại không hợp lệ.");
                return null;
            }
            return phoneBook;
        }
        System.out.println("Lỗi: Dữ liệu CSV không hợp lệ.");
        return null;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return Pattern.matches("^0\\d{9}$", phoneNumber);
    }
}