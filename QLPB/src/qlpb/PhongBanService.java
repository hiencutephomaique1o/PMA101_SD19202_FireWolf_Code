/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlpb;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class PhongBanService {
    ArrayList<QLPB> lisPongBan = new ArrayList<>();
    public void Fakedata(){
        lisPongBan.add(new QLPB("PB001", "Hành Chính", "P401", "02345"));
        lisPongBan.add(new QLPB("PB002", "Đào Tạo", "P402", "02346"));
        lisPongBan.add(new QLPB("PB003", "Dịch vụ", "P403", "02347"));
        lisPongBan.add(new QLPB("PB004", "Công Tác", "P404", "023567"));
    }
    public boolean ThemPB(QLPB pb){
        try {
            lisPongBan.add(pb);
             return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean Sua(QLPB pb, int viTri){
        try {
            lisPongBan.set(viTri, pb);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean xoa(int viTri){
        try {
            lisPongBan.remove(viTri);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
