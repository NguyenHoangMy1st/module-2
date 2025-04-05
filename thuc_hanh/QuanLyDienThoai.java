package thuc_hanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyDienThoai {
    private static final String FILE_PATH = "dienthoai.csv";

    private List<DienThoai> danhSachDienThoai;

    public QuanLyDienThoai() {
        this.danhSachDienThoai = new ArrayList<>();
    }

    public List<DienThoai> docDanhSachDienThoai() throws IOException {
        File file = new File(FILE_PATH);
        if (!file.exists()) {
            System.out.println("File không tồn tại: " + FILE_PATH);
            return new ArrayList<>();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");

                if (fields.length == 7) {
                    int id = Integer.parseInt(fields[0]);
                    String tenDienThoai = fields[1];
                    int giaBan = Integer.parseInt(fields[2]);
                    int soLuong = Integer.parseInt(fields[3]);
                    String nhaSanXuat = fields[4];
                    int thoiGianBaoHanh = Integer.parseInt(fields[5]);
                    String phamViBaoHanh = fields[6];
                    DienThoaiChinhHang dtChinhHang = new DienThoaiChinhHang(id, tenDienThoai, giaBan, soLuong, nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh);
                    danhSachDienThoai.add(dtChinhHang);
                } else if (fields.length == 8) {
                    int id = Integer.parseInt(fields[0]);
                    String tenDienThoai = fields[1];
                    int giaBan = Integer.parseInt(fields[2]);
                    int soLuong = Integer.parseInt(fields[3]);
                    String nhaSanXuat = fields[4];
                    String quocGiaXachTay = fields[5];
                    String trangThai = fields[6];
                    DienThoaiXachTay dtXachTay = new DienThoaiXachTay(id, tenDienThoai, giaBan, soLuong, nhaSanXuat, quocGiaXachTay, trangThai);
                    danhSachDienThoai.add(dtXachTay);
                }
            }
        }

        return danhSachDienThoai;
    }

    public void luuDanhSachDienThoai(List<DienThoai> danhSachDienThoai) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (DienThoai dt : danhSachDienThoai) {
                String data = "";
                if (dt instanceof DienThoaiChinhHang) {
                    DienThoaiChinhHang dtChinhHang = (DienThoaiChinhHang) dt;
                    data = dtChinhHang.getId() + "," + dtChinhHang.getTen() + "," + dtChinhHang.getGia() + "," +
                            dtChinhHang.getSoLuong() + "," + dtChinhHang.getNhaSx() + "," + dtChinhHang.getThoiGianBaoHanh() + "," +
                            dtChinhHang.getPhamViBaoHanh();
                } else if (dt instanceof DienThoaiXachTay) {
                    DienThoaiXachTay dtXachTay = (DienThoaiXachTay) dt;
                    data = dtXachTay.getId() + "," + dtXachTay.getTen() + "," + dtXachTay.getGia() + "," +
                            dtXachTay.getSoLuong() + "," + dtXachTay.getNhaSx() + "," + dtXachTay.getQuocGiaXachTay() + "," +
                            dtXachTay.getTrangThai();
                }

                bw.write(data);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    public void themDienThoai() {
        Scanner sc = new Scanner(System.in);
        try {
            List<DienThoai> danhSachDienThoai = docDanhSachDienThoai();
            int idMoi = danhSachDienThoai.size() + 1;
            System.out.println("Nhập tên điện thoại mới:");
            String tenDienThoai = sc.nextLine();
            System.out.println("Nhập giá điện thoại:");
            int giaBan = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập số lượng điện thoại:");
            int soLuong = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập nhà sản xuất:");
            String nhaSanXuat = sc.nextLine();
            System.out.println("Nhập loại điện thoại (1. Chính hãng 2. Xách tay):");
            int loaiDienThoai = Integer.parseInt(sc.nextLine());

            if (loaiDienThoai == 1) {
                System.out.println("Nhập thời gian bảo hành (số ngày):");
                int thoiGian = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập phạm vi bảo hành (Toan quoc hay Quoc te)");
                String phamVi = sc.nextLine();
                if (thoiGian <= 0 || thoiGian > 730) {
                    System.out.println("Thời gian bảo hành không hợp lệ");
                    return;
                }
                if (!phamVi.equals("Toan quoc") && !phamVi.equals("Quoc te")) {
                    System.out.println("Phạm vi bảo hành không hợp lệ");
                    return;
                }
                DienThoaiChinhHang chinhHang = new DienThoaiChinhHang(idMoi, tenDienThoai, giaBan, soLuong, nhaSanXuat, thoiGian, phamVi);
                danhSachDienThoai.add(chinhHang);

            } else if (loaiDienThoai == 2) {
                System.out.println("Nhập quốc gia xách tay:");
                String quocGiaXachTay = sc.nextLine();
                if (quocGiaXachTay.equalsIgnoreCase("Viet Nam")) {
                    System.out.println("Quốc gia xách tay không thể là Việt Nam.");
                    return;
                }
                System.out.println("Nhập trạng thái (Da sua chua/Chua sua chua):");
                String trangThai = sc.nextLine();
                if (!trangThai.equals("Da sua chua") && !trangThai.equals("Chua sua chua")) {
                    System.out.println("Trạng thái không hợp lệ.");
                    return;
                }
                DienThoaiXachTay xachTay = new DienThoaiXachTay(idMoi, tenDienThoai, giaBan, soLuong, nhaSanXuat, quocGiaXachTay, trangThai);
                danhSachDienThoai.add(xachTay);
            }
            luuDanhSachDienThoai(danhSachDienThoai);

        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }

    public void hienThiDanhSach() {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;

        while (!isExit) {
            System.out.println("\nHiển thị danh sách điện thoại");
            System.out.println("1. Hiển thị danh sách điện thoại chính hãng");
            System.out.println("2. Hiển thị danh sách điện thoại xách tay");
            System.out.println("3. Hiển thị tất cả các loại điện thoại");
            System.out.println("0. Thoát");

            int choice;
            while (true) {
                System.out.print("Nhập lựa chọn của bạn: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Nhập không hợp lệ, vui lòng thử lại.");
                }
            }

            switch (choice) {
                case 1:
                    System.out.println("\nDANH SÁCH ĐIỆN THOẠI CHÍNH HÃNG");
                    for (DienThoai dt : danhSachDienThoai) {
                        if (dt instanceof DienThoaiChinhHang) {
                            System.out.println(dt.hienThiThongTin());
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nDANH SÁCH ĐIỆN THOẠI XÁCH TAY");
                    for (DienThoai dt : danhSachDienThoai) {
                        if (dt instanceof DienThoaiXachTay) {
                            System.out.println(dt.hienThiThongTin());
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nTẤT CẢ DÁN SÁCH ĐIỆN THOẠI");
                    for (DienThoai dt : danhSachDienThoai) {
                        System.out.println(dt.hienThiThongTin());
                    }
                    break;
                case 0:
                    isExit = true;
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
            }
        }
    }


    public void xoaDienThoai() {
        Scanner scanner = new Scanner(System.in);
        try {
            List<DienThoai> danhSachDienThoai = docDanhSachDienThoai();
            System.out.print("Nhập ID điện thoại cần xóa: ");
            int id = Integer.parseInt(scanner.nextLine());

            DienThoai dienThoaiCanXoa = null;
            for (DienThoai dt : danhSachDienThoai) {
                if (dt.getId() == id) {
                    dienThoaiCanXoa = dt;
                    break;
                }
            }

            if (dienThoaiCanXoa != null) {
                System.out.print("Bạn có chắc chắn muốn xóa điện thoại (Yes/No)? ");
                String xacNhan = scanner.nextLine();

                if (xacNhan.equalsIgnoreCase("Yes")) {
                    danhSachDienThoai.remove(dienThoaiCanXoa);
                    luuDanhSachDienThoai(danhSachDienThoai);
                    System.out.println("Điện thoại đã được xóa thành công!");
                } else {
                    System.out.println("Quay lại menu chính.");
                }
            } else {
                System.out.println("ID điện thoại không tồn tại.");
            }
        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }

    public void timKiemDienThoai() {
        Scanner scanner = new Scanner(System.in);
        try {
            List<DienThoai> danhSachDienThoai = docDanhSachDienThoai();
            System.out.print("Nhập từ khóa tìm kiếm (ID hoặc Tên điện thoại): ");
            String tuKhoa = scanner.nextLine().toLowerCase();

            boolean timThay = false;
            for (DienThoai dt : danhSachDienThoai) {
                if (String.valueOf(dt.getId()).contains(tuKhoa) || dt.getTen().toLowerCase().contains(tuKhoa)) {
                    System.out.println(dt.hienThiThongTin());
                    timThay = true;
                }
            }

            if (!timThay) {
                System.out.println("Không tìm thấy điện thoại nào với từ khóa: " + tuKhoa);
            }
        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra: " + e.getMessage());
        }
    }
}
