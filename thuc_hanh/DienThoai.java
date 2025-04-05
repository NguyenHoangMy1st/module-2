package thuc_hanh;

import java.io.Serializable;

public class DienThoai implements Serializable {
    private int id;
    private String ten;
    private int gia;
    private int soLuong;
    private String nhaSx;

    public DienThoai(int id, String ten, int gia, int soLuong, String nhaSx) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
        this.nhaSx = nhaSx;
    }
    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public int getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }
    public String getNhaSx() {
        return nhaSx;
    }

    public String hienThiThongTin() {
        return null;
    }
}
