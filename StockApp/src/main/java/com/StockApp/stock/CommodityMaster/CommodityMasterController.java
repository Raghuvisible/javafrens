package com.StockApp.stock.CommodityMaster;

import com.StockApp.stock.model.CommodityMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/commoditymaster")
@CrossOrigin
@Validated
public class CommodityMasterController {

    @Autowired
    private CommodityMasterService commodityMasterService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public CommodityMaster createCommodityMaster(@RequestBody CommodityMaster input){
        return commodityMasterService.createCommodityMaster(input);
    }
}
