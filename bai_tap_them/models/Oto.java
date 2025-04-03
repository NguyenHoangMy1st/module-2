package bai_tap_them.models;

public class Oto extends PhuongTienGiaoThong {
    private int soChoNgoi;
    private String kieuXe;

    public Oto(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    @Override
    public String toCSV() {
        return bienKiemSoat + "," + hangSanXuat + "," + namSanXuat + "," + chuSoHuu + "," + kieuXe + "," + soChoNgoi;
    }
}