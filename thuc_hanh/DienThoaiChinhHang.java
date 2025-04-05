package thuc_hanh;

public class DienThoaiChinhHang extends DienThoai {

    private int thoiGianBaoHanh;
    private String phamViBaoHanh;

    public DienThoaiChinhHang(int id, String ten, int gia, int soLuong, String nhaSx, int thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, ten, gia, soLuong, nhaSx);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    @Override
    public String hienThiThongTin() {
        return "ID: " + getId() + ", Tên: " + getTen() + ", Giá: " + getGia() + ", Số lượng: " + getSoLuong() + ", Nhà sản xuất: " + getNhaSx() +
                ", Thời gian bảo hành: " + thoiGianBaoHanh + " ngày, Phạm vi bảo hành: " + phamViBaoHanh;
    }
}
