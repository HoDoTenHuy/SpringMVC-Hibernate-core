package danghuy.deptrai.controller;

import danghuy.deptrai.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;

@Controller
@RequestMapping("/")
public class TrangChuController {

    private final NhanVienService nhanVienService;

    @Autowired
    public TrangChuController(NhanVienService nhanVienService){
        this.nhanVienService = nhanVienService;
    }


    @GetMapping()
    @Transactional
    public String getrTrangChu(){
        nhanVienService.getNhanVienID(1).toString();
        return "trangchu";
    }

}
