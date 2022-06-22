package com.StockApp.stock.UnitMaster;

import com.StockApp.stock.Repository.UnitMasterRepo;
import com.StockApp.stock.model.UnitMaster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitMasterService {

    @Autowired
    private UnitMasterRepo unitMasterRepo;

    public UnitMaster createUnitMaster(UnitMaster input) {
        input.setICancelFlag(0);
        return unitMasterRepo.save(input);
    }
}
