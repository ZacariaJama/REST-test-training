package com.example.KeyPrototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;

@SpringBootApplication
public class KeyPrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeyPrototypeApplication.class, args);
	}

	@Bean
	SecurityFilterChain springSecurity(HttpSecurity http) throws Exception {
		HttpSessionRequestCache requestCache = new HttpSessionRequestCache();
		requestCache.setMatchingRequestParameterName("/");
		http.requestCache((cache) -> cache
				.requestCache(requestCache)
			);
		return http.build();
	}
}
