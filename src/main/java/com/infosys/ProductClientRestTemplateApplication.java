package com.infosys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infosys.client.ProductClient;

//@SpringBootApplication
public class ProductClientRestTemplateApplication extends ProductClient {

	public static void main(String[] args) {
	//	SpringApplication.run(ProductClientRestTemplateApplication.class, args);
		//ProductClient pc=new ProductClient();
		callAllProducts();
	
	}

}
