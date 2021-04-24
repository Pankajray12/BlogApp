package com.blogCrud.blogApplication.Repository;

import com.blogCrud.blogApplication.Entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comments,Long> {

}
