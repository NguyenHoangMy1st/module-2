package bai_tap_them.services;

import bai_tap_them.models.PhuongTienGiaoThong;

import java.util.ArrayList;
import java.util.List;

public class QuanLyPhuongTien {
    private List<PhuongTienGiaoThong> danhSachPhuongTien = new ArrayList<>();

    public void themMoiPhuongTien(PhuongTienGiaoThong pt){
        danhSachPhuongTien.add(pt);

    }
}
