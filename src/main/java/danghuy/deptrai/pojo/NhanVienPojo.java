package danghuy.deptrai.pojo;

import org.springframework.stereotype.Component;


@Component
public class NhanVienPojo {
    private Integer id;
    private String tenNhanVien;
    private String diaChi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public NhanVienPojo() {
    }

    public NhanVienPojo(Integer id, String tenNhanVien, String diaChi) {
        this.id = id;
        this.tenNhanVien = tenNhanVien;
        this.diaChi = diaChi;
    }
}
