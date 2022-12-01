package com.socialLogin.member;

import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.oauth.OAuth20Service;

public class SNSLogin {

	private OAuth20Service oauthService; 
	
	public SNSLogin(SnsValue sns) {
		this.oauthService = new ServiceBuilder(sns.getClientId())
				.apiSecret(sns.getClientSecret())
				.callback(sns.getRedirectUrl())
				.defaultScope("profile")
				.build(sns.getApi20Instance());
	}

	public String getNaverAuthUrl() {
		return this.oauthService.getAuthorizationUrl();
	}
}
