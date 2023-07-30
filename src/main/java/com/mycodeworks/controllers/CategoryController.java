package com.mycodeworks.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycodeworks.models.Category;
import com.mycodeworks.services.CategoryService;


@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService catService;
	
	
	@GetMapping("/categories")
	@ResponseBody
	public List<Category> getAllCategories(){
		return catService.getCatgories();
		
	}

	
	@PostMapping(path="/categories",consumes="application/json")
	@ResponseBody
	public Category addNewCatgory(@RequestBody Category cat){
		return catService.addNewCatgory(cat);
		
	}

}
