package com.product.service.smm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	ProductRepository repo;
	@GetMapping("/a")
	
	public String product()
	
	{ 
		return("Details");
	}
	@PostMapping("/product")
	public product addproduct(@RequestBody product pro)
	
	{
		return repo.save(pro);
	}
	@GetMapping("/product")
	public List<product> getproduct()
	
	{
		return repo.findAll();
	}
	
	@DeleteMapping("/product/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		repo.deleteById(id);
	}
	
	@PutMapping("/product/{id}")
	public product  updateProduct(@PathVariable int id, @RequestBody product pro)
	{
		pro.setProductId(id);
		return repo.save(pro);
	}
}
