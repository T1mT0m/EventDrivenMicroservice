package com.github.bwar.eventdrivenms.estore.ProductsService.Rest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@PostMapping
	public String createProduct() {
		return "Http POST handler";
	}
	
	@GetMapping
	public String getProduct() {
		return "Http GET handler";
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
