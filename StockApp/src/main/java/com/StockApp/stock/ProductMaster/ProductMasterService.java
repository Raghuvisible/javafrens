package com.StockApp.stock.ProductMaster;

import com.StockApp.stock.Repository.ProductMasterRepo;
import com.StockApp.stock.model.ProductMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductMasterService {

    @Autowired
    private ProductMasterRepo productMasterRepo;

    public ProductMaster createProductMaster(ProductMaster input) {
        return productMasterRepo.save(input);
    }
}
