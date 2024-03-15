package themDS;


import themDS.NhanVien;
import java.util.ArrayList;


public class NhanVienService {
    public ArrayList<NhanVien> listNhanVien = new ArrayList<>();
    boolean addEmployee(NhanVien nv) {
        try {
            listNhanVien.add(nv);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
