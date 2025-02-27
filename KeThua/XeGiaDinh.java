package KeThua;

public class XeGiaDinh extends Xe{

    public XeGiaDinh(String bienSo, String hangXe, String mauSac){
        super(bienSo, hangXe, mauSac);
    }
    public void diCamTrai(){
        System.out.println("Xe gia dinh di cam trai");
    }

    public void diCamTrai(String message){
        System.out.println(message);
    }

    @Override
    public void diChuyen(){
        super.diChuyen();
        System.out.println("Xe gia dinh di chuyen");
    }
}
