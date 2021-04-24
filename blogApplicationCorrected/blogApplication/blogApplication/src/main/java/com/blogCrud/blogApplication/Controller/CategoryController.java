package com.blogCrud.blogApplication.Controller;

import com.blogCrud.blogApplication.Entity.Categories;
import com.blogCrud.blogApplication.Service.CategoryService;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;



    @GetMapping("/categories")

    public List<Categories> getAllCategory(){
        List<Categories> bookInfo = categoryService.getAllReviews();
        return bookInfo;
    }


//    @GetMapping("/rev")
//    public List<Review> getReviews(){
//        return reviewsService.getReviews();
//
//    }


    @PostMapping("/category")
    public Categories addCategory(@RequestBody Categories category){
        Categories category1 = categoryService.addCategory(category);
        return category1;
    }
//
//    @PutMapping("/review")
//    public Review updateReview(@RequestBody Review review){
//        Review review1 = reviewsService.updateReview(review);
//        return review1;
//    }
//
//    @DeleteMapping("/review/{id}")
//    public String deleteReview(@PathVariable("id") Long reviewId){
//
//        boolean flag = reviewsService.deleteReview(reviewId);
//        if(flag) return "Entry Deleted";
//        else return "Fail to Delete";
//    }

}
