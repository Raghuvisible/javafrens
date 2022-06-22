package com.StockApp.stock.UnitMaster;

import com.StockApp.stock.model.UnitMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/unitmaster")
@CrossOrigin
@Validated
public class UnitMasterController {

    @Autowired
    private UnitMasterService unitMasterService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public UnitMaster createUnitMaster(@RequestBody UnitMaster input){
        return unitMasterService.createUnitMaster(input);
    }
}
