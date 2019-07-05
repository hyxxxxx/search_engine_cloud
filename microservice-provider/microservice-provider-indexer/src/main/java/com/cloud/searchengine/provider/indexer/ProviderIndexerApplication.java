package com.cloud.searchengine.provider.indexer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProviderIndexerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderIndexerApplication.class, args);
	}

}
