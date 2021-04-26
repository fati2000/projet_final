package com.loizenai.jwtauthentication.message.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginForm {
    @NotBlank
    @Size(min=3, max = 60)
    private String cin;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

 
    public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}