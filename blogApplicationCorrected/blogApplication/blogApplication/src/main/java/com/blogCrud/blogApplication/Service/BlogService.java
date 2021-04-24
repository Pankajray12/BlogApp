package com.blogCrud.blogApplication.Service;

import com.blogCrud.blogApplication.Entity.Blogs;
import com.blogCrud.blogApplication.Entity.Categories;
import com.blogCrud.blogApplication.Entity.Comments;
import com.blogCrud.blogApplication.Repository.BlogRepository;
import com.blogCrud.blogApplication.Repository.CategoryRepository;
import com.blogCrud.blogApplication.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BlogService {
    @Autowired
    BlogRepository blogRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    CommentRepository commentRepository;
    public List<Blogs> getBlogs() {
        return blogRepository.findAll();
    }

    public Blogs addBlog(Blogs blog) {
        return blogRepository.save(blog);
    }

 @Transactional
    public Blogs assignCategory(Long categoryId, List<Categories> categories) {

            Blogs blog=blogRepository.findById(categoryId).get();

            for(Categories category: categories){
                 blog.addCategory(category);
                 category.setBlogs(blog);
                categoryRepository.save(category);

            }

    return blog;
    }
    @Transactional
    public Blogs assignComments(Long id, List<Comments> comments) {

        Blogs blog=blogRepository.findById(id).get();

        for(Comments comment: comments){
            blog.addComments(comment);
            comment.setBlogs(blog);
            commentRepository.save(comment);

        }

        return blog;

    }

//    public Blogs updateBlog(Blogs blog) {
//
//
//
//    }
}
