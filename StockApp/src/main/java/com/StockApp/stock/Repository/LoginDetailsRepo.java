package com.StockApp.stock.Repository;

import com.StockApp.stock.model.LoginDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDetailsRepo extends CrudRepository<LoginDetails, Integer> {

	LoginDetails findByvUserName(String username);

	//LoginDetails findByVUserame(String username);
	
}