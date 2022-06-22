package com.StockApp.stock.Login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping({ "/health" })
	public String firstPage() {
		return "Hello World Success";
	}

}