package com.cloud.searchengine.provider.analyzer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProviderAnalyzerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderAnalyzerApplication.class, args);
	}

}
