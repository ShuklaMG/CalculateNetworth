package com.cts.calculatenetworth.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "${AUTH.URL}", name = "AUTHORIZATION-SERVICE")
public interface AuthorizationClient {
	
	@GetMapping("/getid")
	public int getUserId(@RequestHeader("Authorization") String authorization);

}