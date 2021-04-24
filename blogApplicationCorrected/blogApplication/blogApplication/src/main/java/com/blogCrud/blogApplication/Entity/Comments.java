package com.blogCrud.blogApplication.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Comments {

    @Id
    private long commentId;
    private String description;
   // @JsonBackReference
   @JsonIgnore
    @ManyToOne(fetch= FetchType.LAZY)

    private Blogs blog;

    public void setBlogs(Blogs blog){
        this.blog=blog;
    }
    public Blogs getBlogs(){
        return blog;
    }


}
