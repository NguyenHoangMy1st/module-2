package thuc_hanh;

public class DienThoaiXachTay extends DienThoai{
    private String quocGiaXachTay;
    private String trangThai;


    public DienThoaiXachTay(int id, String ten, int gia, int soLuong, String nhaSx, String quocGiaXachTay, String trangThai) {
        super(id, ten, gia, soLuong, nhaSx);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }
}
