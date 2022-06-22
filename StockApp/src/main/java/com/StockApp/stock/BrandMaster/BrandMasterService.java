package com.StockApp.stock.BrandMaster;

import com.StockApp.stock.Repository.BrandMasterRepo;
import com.StockApp.stock.model.BrandMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandMasterService {

    @Autowired
    private BrandMasterRepo brandMasterRepo;

    public BrandMaster createBrandMaster(BrandMaster input) {
        input.setICancelFlag(0);
        return brandMasterRepo.save(input);
    }
}
