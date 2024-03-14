
package com.mycompany.thongtincanhan;


public class NhanVien {
    private String hoten;
    private int tuoi;
    private String maNV;
    private String email;
    private String ngaysinh;
    private int gioitinh;
    private String diaChi;

    public NhanVien() {
    }

    public NhanVien(String hoten, int tuoi, String maNV, String email, String ngaysinh, int gioitinh, String diaChi) {
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.maNV = maNV;
        this.email = email;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diaChi = diaChi;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
}
