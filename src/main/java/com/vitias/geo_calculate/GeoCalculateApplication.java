package com.vitias.geo_calculate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAsync
@EnableTransactionManagement
public class GeoCalculateApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeoCalculateApplication.class, args);
	}
}
