package com.blogCrud.blogApplication.Repository;

import com.blogCrud.blogApplication.Entity.Categories;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Categories,Long> {
}
