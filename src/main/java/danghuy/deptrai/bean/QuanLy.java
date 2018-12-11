package danghuy.deptrai.bean;

public class QuanLy {



    private String chucVu;
    private String luong;

    public QuanLy() {

    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }


    public QuanLy(String chucVu, String luong) {
        this.chucVu = chucVu;
        this.luong = luong;
    }

    public QuanLy(String chucVu) {
        this.chucVu = chucVu;
    }


    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
}
