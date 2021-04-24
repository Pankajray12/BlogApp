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
@Table( uniqueConstraints = { @UniqueConstraint(columnNames = {"user_profile_id"})})
public class Users {
    @Id
   private long userId;
   private String userName;

   @OneToOne
   @JoinColumn(name="user_profile_id")
   private Profile profile;
   //@JsonManagedReference
   @ToString.Exclude
   @OneToMany(mappedBy = "user", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
  // @JsonIgnore
   @JsonManagedReference
   List<Blogs> listOfblog= new ArrayList<>();




   public void addBlog(Blogs blog) {
      this.listOfblog.add(blog);
   }
   public List<Blogs> getBlogList() {
      return listOfblog;
   }

   public void removeBlog(Blogs blog){
      this.listOfblog.remove(blog);
   }


}
