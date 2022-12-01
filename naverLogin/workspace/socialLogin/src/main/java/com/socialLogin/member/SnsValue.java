package com.socialLogin.member;

import org.springframework.util.StringUtils;

import com.github.scribejava.core.builder.api.DefaultApi20;

import lombok.Data;

@Data
public class SnsValue implements SnsUrls{
	
	private String service;
	private String clientId;
	private String clientSecret;
	private String redirectUrl;
	private DefaultApi20 api20Instance;
	
	public SnsValue(String service, String clientId, String clientSecret, String redirectUrl) {
		this.service = service;
		this.clientId = clientId;
		this.clientSecret = clientSecret;
		this.redirectUrl = redirectUrl;
		
		if (service.equalsIgnoreCase("naver")) {
			this.api20Instance = NaverAPI20.instance();
		} 
//		else if (service.equalsIgnoreCase("kakao")) {
//			
//		}
	}
}
