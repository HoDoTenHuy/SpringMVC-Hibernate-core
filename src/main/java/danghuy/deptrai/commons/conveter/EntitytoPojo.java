package danghuy.deptrai.commons.conveter;


import danghuy.deptrai.entity.NhanVienEntity;
import danghuy.deptrai.pojo.NhanVienPojo;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EntitytoPojo {
    public NhanVienPojo convert(NhanVienEntity nhanVienEntity){
        NhanVienPojo nhanVienPojo = new NhanVienPojo();
        nhanVienPojo.setId(nhanVienEntity.getId());
        nhanVienPojo.setTenNhanVien(nhanVienEntity.getTenNhanVien());
        nhanVienPojo.setDiaChi(nhanVienEntity.getDiaChi());
        return nhanVienPojo;
    }
}
