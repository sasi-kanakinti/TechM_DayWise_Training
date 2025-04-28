package com.example.oauth;

import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/profile")
	public Map<String, Object> getUser(@AuthenticationPrincipal Jwt jwt){
		return Map.of(
				"sub", jwt.getSubject(),
				"email", jwt.getClaimAsString("email"),
				"name", jwt.getClaimAsString("name")/*,
				"password", jwt.getClaimAsString("password")*/
				);
	}
	
	@GetMapping("/public")
	public String publicApi() {
		return "This EndPoint is Public!";
	}
}
