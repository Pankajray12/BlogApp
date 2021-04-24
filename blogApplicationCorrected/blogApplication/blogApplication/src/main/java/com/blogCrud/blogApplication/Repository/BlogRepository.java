package com.blogCrud.blogApplication.Repository;

import com.blogCrud.blogApplication.Entity.Blogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blogs, Long> {


}
