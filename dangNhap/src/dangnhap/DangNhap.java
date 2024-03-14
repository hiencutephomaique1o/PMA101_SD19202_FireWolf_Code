/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dangnhap;

/**
 *
 * @author Admin
 */
public class DangNhap {
    private String ten;
    private String pass;

    public DangNhap() {
    }

    public DangNhap(String ten, String pass) {
        this.ten = ten;
        this.pass = pass;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}