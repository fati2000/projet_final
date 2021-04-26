package com.loizenai.jwtauthentication.message.response;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private String cin;
	private Collection<? extends GrantedAuthority> authorities;

	public JwtResponse(String accessToken, String cin, Collection<? extends GrantedAuthority> authorities) {
		this.token = accessToken;
		this.cin = cin;
		this.authorities = authorities;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String username) {
		this.cin = username;
	}
	
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }
}