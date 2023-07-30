package com.mycodeworks.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	// Return State by ID	
		@DeleteMapping(path="/categories/{id}",produces="application/json")
		@ResponseBody
		public ResponseEntity<Object> deleteCategoryById(@PathVariable Integer id) {
			boolean isDeleted= catService.deleteCategoryById(id);
			if(isDeleted) {
	            // Deletion successful
	            String message = "Data deleted successfully.";
	            return new ResponseEntity<>(message, HttpStatus.OK);
	        } else {
	            // Resource not found (Item to Delete Not Found)
	            String message = "Data not found. Unable to delete.";
	            return new ResponseEntity<>(message, HttpStatus.NOT_FOUND);
	        }
		}

}
