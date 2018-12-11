package danghuy.deptrai.service;

import danghuy.deptrai.bean.NhanVien;
import danghuy.deptrai.commons.conveter.EntitytoPojo;
import danghuy.deptrai.dao.NhanVienDao;
import danghuy.deptrai.entity.NhanVienEntity;
import danghuy.deptrai.pojo.NhanVienPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienService {
    @Autowired
    NhanVienDao nhanVienDao;

    @Autowired
    EntitytoPojo entitytoPojo;

    public NhanVienPojo getNhanVienID(Integer id){
        NhanVienEntity nhanVienEntity = nhanVienDao.getNhanVien(id);
        NhanVienPojo nhanVienPojo=  entitytoPojo.convert(nhanVienEntity);
        return nhanVienPojo;
    }
}
