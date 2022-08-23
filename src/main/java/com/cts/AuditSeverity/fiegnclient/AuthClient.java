package com.cts.AuditSeverity.fiegnclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cts.AuditSeverity.pojo.AuthResponse;
/**
 * 
 *
 */
@FeignClient(url = "http://${API:localhost:8090}/api/authapp", name = "audit-auth")
public interface AuthClient {
	
	
	
	@GetMapping(value = "/validate")
	public ResponseEntity<AuthResponse> getValidity(@RequestHeader("Authorization") String token) ;


}

	
