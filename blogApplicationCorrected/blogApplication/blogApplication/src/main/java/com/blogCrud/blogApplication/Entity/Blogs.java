package com.blogCrud.blogApplication.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Blogs {
    @Id
    private long blogId;
    private String description;

    @ManyToOne(fetch= FetchType.LAZY, cascade = CascadeType.ALL)

   @JsonBackReference

    private Users user;
    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    @ToString.Exclude
    @OneToMany(mappedBy = "blog", fetch = FetchType.LAZY, cascade = CascadeType.ALL)

    @JsonManagedReference
    List<Categories> categoriesList= new ArrayList<>();

    public void addCategory(Categories category){
        this.categoriesList.add(category);
    }
    public List<Categories> getCategory() {
        return categoriesList;
    }

    public void removeCategory(Categories category){
        this.categoriesList.remove(category);
    }


    //@JsonManagedReference
    @ToString.Exclude
    @OneToMany(mappedBy = "blog", fetch = FetchType.LAZY,cascade = CascadeType.ALL)

   @JsonManagedReference
    List<Comments> commentsList= new ArrayList<>();

    public void addComments(Comments comments){
        this.commentsList.add(comments);
    }
    public List<Comments> getComments() {
        return commentsList;
    }



}
