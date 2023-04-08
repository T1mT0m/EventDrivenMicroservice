package com.github.bwar.eventdrivenms.estore.ProductsService.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private Environment env;
	
	@PostMapping
	public String createProduct() {
		return "Http POST handler";
	}
	
	@GetMapping
	public String getProduct() {
		return "Http GET handler " + env.getProperty("local.server.port");
	}
	
	@PutMapping
	public String updateProduct() {
		return "Http PUT handler";
	}
	
	@DeleteMapping
	public String deleteProduct() {
		return "Http DELETE handler";
	}
}
