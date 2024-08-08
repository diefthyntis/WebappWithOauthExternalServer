package com.openclassrooms.controllers;

import java.security.Principal;



import org.springframework.security.core.annotation.AuthenticationPrincipal;


import org.springframework.security.oauth2.core.oidc.user.OidcUser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {

	@GetMapping("/user")
	public String getUser() {
		return "Welcome, User";
	}

	@GetMapping("/admin")
	public String getAdmin() {
		return "Welcome, Admin";
	}

	@GetMapping("/*")
	public String getUserInfo(Principal user, @AuthenticationPrincipal OidcUser oidcUser) {
		return "Welcome from getUserInfo";
	}

	@GetMapping("/toto")
	public String getTiti() {
		return "Welcome, lulu";
	}



}