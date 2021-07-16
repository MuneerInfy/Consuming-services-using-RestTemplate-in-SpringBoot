package com.infosys.client;

import org.springframework.web.client.RestTemplate;

public class ProductClient {
	
	static String url="http://localhost:9196/getProducts";
	
	public static void callAllProducts() {
	RestTemplate restTemplate = new RestTemplate();
	String s=restTemplate.getForObject(url, String.class);
	System.out.println(s);
	}
}
