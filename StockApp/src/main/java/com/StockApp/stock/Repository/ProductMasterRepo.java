package com.StockApp.stock.Repository;

import com.StockApp.stock.model.ProductMaster;
import org.springframework.data.repository.CrudRepository;

public interface ProductMasterRepo extends CrudRepository<ProductMaster,Integer> {
}
