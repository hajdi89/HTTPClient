package com.mobeelizer.http.client.utils;

import org.apache.http.client.methods.HttpRequestBase;

public class ConnectionUtils {
	public static void addCommonHeaders(HttpRequestBase request) {
		request.addHeader("mas-vendor-name", "hajduczek");
        request.addHeader("mas-application-name", "test");
        request.addHeader("mas-application-instance-name", "test");
        request.addHeader("mas-definition-digest", "hajduczek$test$MANUAL$mobile$users${users&mobile}${{TEXT$true$user-mobile=33330}&{}$credentials}");
        request.addHeader("mas-device-name", "mobile");
        request.addHeader("mas-device-identifier", "356345042878198");
        request.addHeader("mas-user-name", "testUser");
        request.addHeader("mas-user-password", "qwerty123");
        request.addHeader("Content-Type", "application/json"); 
	}
}
