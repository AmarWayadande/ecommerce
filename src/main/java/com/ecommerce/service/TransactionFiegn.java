package com.ecommerce.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@FeignClient(value = "bank-service", url = "http://localhost:8787/bank")
@FeignClient(name = "http://BANK-SERVICE/bank")
public interface TransactionFiegn {
	@PostMapping("/FundTransfer")
	public String transaction(@RequestParam long FromAccount , @RequestParam long ToAccount, @RequestParam long amount);
}
