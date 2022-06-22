package com.StockApp.stock.ProductMaster;

import com.StockApp.stock.model.ProductMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/productmaster")
@CrossOrigin
@Validated
public class ProductMasterController {

    @Autowired
    private ProductMasterService productMasterService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public ProductMaster createProductMaster(@RequestBody ProductMaster input){
        return productMasterService.createProductMaster(input);
    }
}
