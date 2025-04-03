package bai_tap_them.models;

public abstract class PhuongTienGiaoThong {
    protected String bienKiemSoat;
    protected String hangSanXuat;
    protected int namSanXuat;
    protected String chuSoHuu;

    public PhuongTienGiaoThong(String bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public abstract String toCSV();

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }
}
