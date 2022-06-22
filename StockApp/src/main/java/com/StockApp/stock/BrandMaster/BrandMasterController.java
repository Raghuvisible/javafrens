package com.StockApp.stock.BrandMaster;

import com.StockApp.stock.model.BrandMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/brandmaster")
@CrossOrigin
@Validated
public class BrandMasterController {

    @Autowired
    private BrandMasterService brandMasterService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public BrandMaster createBrandMaster(@RequestBody BrandMaster input){
        return brandMasterService.createBrandMaster(input);
    }
}
