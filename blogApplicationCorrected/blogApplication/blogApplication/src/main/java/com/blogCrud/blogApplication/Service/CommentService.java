package com.blogCrud.blogApplication.Service;

import com.blogCrud.blogApplication.Entity.Comments;
import com.blogCrud.blogApplication.Repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommentService {
    @Autowired
    CommentRepository commentRepository;
    public List<Comments> getAllComments() {
     return commentRepository.findAll();
    }

    public Comments insertComments(Comments comments) {
        return commentRepository.save(comments);
    }


}
