package com.blogCrud.blogApplication.Controller;

import com.blogCrud.blogApplication.Entity.*;
import com.blogCrud.blogApplication.Service.BlogService;
import com.blogCrud.blogApplication.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {


    @Autowired
    BlogService blogService;



    @GetMapping("/blogs")
    public List<Blogs> getAllBlogs(){
        List<Blogs> blogInfo = blogService.getBlogs();
        return blogInfo;
    }



    @PostMapping("/blog")
    public Blogs addBlog(@RequestBody Blogs blog){
        return blogService.addBlog(blog);
    }


    @PostMapping("/assign/{id}/category")
    public Blogs assignCategory(@PathVariable("id") Long id, @RequestBody List<Categories> categories){

        return blogService.assignCategory(id, categories);
    }


    @PostMapping("/assign/{id}/comment")
    public Blogs assignComments(@PathVariable("id") Long id, @RequestBody List<Comments> comments){

        return blogService.assignComments(id, comments);
    }
//
//    @PutMapping("/putblog")
//    public Blogs updateblog(@RequestBody Blogs blog){
//        return blogService.updateBlog(blog);
//
//    }

//    @DeleteMapping("/blog/{id}")
//    public String deleteblog(@PathVariable("id") Long blogId){
//
//        boolean flag = blogService.deleteBlog(blogId);
//        if(flag) return "Entry Deleted";
//        else return "Fail to Delete";
//    }



}
