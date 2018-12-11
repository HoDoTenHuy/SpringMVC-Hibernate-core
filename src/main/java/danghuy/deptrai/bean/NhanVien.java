package danghuy.deptrai.bean;

import jdk.nashorn.internal.objects.annotations.Property;

public class NhanVien {
    private String id;
    private String tenNhanVien;
    private Property xxxs;
    private QuanLy quanLy;

    public NhanVien() {
    }

    public NhanVien(String id, String tenNhanVien, Property xxxs, QuanLy quanLy) {
        this.id = id;
        this.tenNhanVien = tenNhanVien;
        this.xxxs = xxxs;
        this.quanLy = quanLy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public Property getXxxs() {
        return xxxs;
    }

    public void setXxxs(Property xxxs) {
        this.xxxs = xxxs;
    }

    public QuanLy getQuanLy() {
        return quanLy;
    }

    public void setQuanLy(QuanLy quanLy) {
        this.quanLy = quanLy;
    }
}
