package com.mycodeworks.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycodeworks.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer>{

}
