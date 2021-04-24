package com.blogCrud.blogApplication.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Categories {
     @Id
    private long categoriesId;
    private String categoryName;

    @ManyToOne(fetch= FetchType.LAZY,cascade = CascadeType.ALL)
    @JsonBackReference
   // @JsonIgnore
    private Blogs blog;

    public Blogs getBlogs() {
        return blog;
    }

    public void setBlogs(Blogs blog) {
        this.blog = blog;
    }




}
