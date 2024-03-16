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
    public boolean deleteEmployee( int index){        
        try {
            listNhanVien.remove(index);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean updateEmployee( NhanVien nv, int index){        
        try {
            listNhanVien.set(index, nv);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
