package bai_tap_them.models;

public class XeTai extends PhuongTienGiaoThong{
    private double taiTrong;

    public XeTai(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, double taiTrong ) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.taiTrong = taiTrong;
    }

    @Override
    public String toCSV() {
        return bienKiemSoat + "," + hangSanXuat + "," + namSanXuat + "," + chuSoHuu + "," + taiTrong;
    }

}
