package bai_tap_them.models;

public class XeMay extends PhuongTienGiaoThong{
    private int congSuat;

    public XeMay(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int congSuat) {
        super(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    @Override
    public String toCSV() {
        return bienKiemSoat + "," + hangSanXuat + "," + namSanXuat + "," + chuSoHuu + "," + congSuat;
    }
}
