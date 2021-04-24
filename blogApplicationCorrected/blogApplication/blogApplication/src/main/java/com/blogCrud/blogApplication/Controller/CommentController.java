package com.blogCrud.blogApplication.Controller;

import com.blogCrud.blogApplication.Entity.Comments;
import com.blogCrud.blogApplication.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @GetMapping("/comments")
    public List<Comments> getAllComments(){
        return commentService.getAllComments();
    }

    @PostMapping("/comment")
    public Comments insertComments(Comments comments){

        return commentService.insertComments(comments);
    }

}
