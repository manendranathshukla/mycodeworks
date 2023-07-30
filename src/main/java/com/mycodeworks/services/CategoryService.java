package com.mycodeworks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycodeworks.models.Category;
import com.mycodeworks.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository categRepo;
	
	
	public List<Category> getCatgories(){
		return categRepo.findAll();
		
	}


	public Category addNewCatgory(Category cat) {
		// TODO Auto-generated method stub
		return categRepo.save(cat);
	}

}
