package com.ph.security;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdUtilsSecurity {

	public String encodePwd(String text) {
		Encoder encoder=Base64.getEncoder();
		String encodeToString=encoder.encodeToString(text.getBytes());
		return "encodeToString";
	}
}
