package ss6_ke_thua;

public class Xe {
    private String bienSo;
    private String hangXe;
    private String mauSac;

    public Xe(String bienSo, String hangXe, String mauSac) {
        this.bienSo = bienSo;
        this.hangXe = hangXe;
        this.mauSac = mauSac;
    }
    public Xe(){}

    public String getBienSo() {
        return bienSo;
    }
    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }
    public String getHangXe() {
        return hangXe;
    }
    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }
    public String getMauSac() {
        return mauSac;
    }
    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public String toString() {
        return "Xe [bienSo = " + bienSo + ", hangXe = " + hangXe + ", mauSac = " + mauSac + "]";
    }
    public void diChuyen(){
        System.out.println("diChuyen");
    }
}
