package com.blogCrud.blogApplication.Service;

import com.blogCrud.blogApplication.Entity.Categories;
import com.blogCrud.blogApplication.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    public List<Categories> getAllReviews() {
        return categoryRepository.findAll();
    }

    public Categories addCategory(Categories category) {
        return categoryRepository.save(category);
    }

}
