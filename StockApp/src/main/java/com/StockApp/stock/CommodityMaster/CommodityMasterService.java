package com.StockApp.stock.CommodityMaster;

import com.StockApp.stock.Repository.CommodityMasterRepo;
import com.StockApp.stock.model.CommodityMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommodityMasterService {

    @Autowired
    private CommodityMasterRepo commodityMasterRepo;

    public CommodityMaster createCommodityMaster(CommodityMaster input) {
        input.setICancelFlag(0);
        return commodityMasterRepo.save(input);
    }
}
