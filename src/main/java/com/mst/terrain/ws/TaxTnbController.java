package com.mst.terrain.ws;

import com.mst.terrain.bean.TaxTnb;
import com.mst.terrain.process.taxTnb.save.TaxTnbSaveProcess;
import com.mst.terrain.process.taxTnb.save.TaxTnbSaveRequest;
import com.mst.terrain.service.facade.TaxTnbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/taxTnb")
public class TaxTnbController {
    @Autowired
    private TaxTnbService taxTnbService;


    @Autowired
    private TaxTnbSaveProcess taxTnbSaveProcess;

    @PostMapping("/")
    public void save(@RequestBody TaxTnbSaveRequest taxTnbSaveRequest) {
        taxTnbSaveProcess.handel(taxTnbSaveRequest);
    }
    @GetMapping("/")
    public List<TaxTnb> findAll() {
        return taxTnbService.findAll();
    }
}
