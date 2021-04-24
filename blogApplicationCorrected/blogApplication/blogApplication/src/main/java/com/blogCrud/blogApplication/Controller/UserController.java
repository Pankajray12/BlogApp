package com.blogCrud.blogApplication.Controller;

import com.blogCrud.blogApplication.Entity.Blogs;
import com.blogCrud.blogApplication.Entity.Profile;
import com.blogCrud.blogApplication.Entity.Users;
import com.blogCrud.blogApplication.Service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.desktop.UserSessionEvent;
import java.util.List;
@RestController
public class UserController {
    @Autowired
    UserService userService;
//
//    @PutMapping("/update")
//    public Users updateUsers(@RequestBody Users user){
//        return userService.updateUsers(user);
//    }
//

    @GetMapping("/users")
    public List<Users> getUserDetails(){
        List<Users> user=userService.getUserDetails();
        return user;
    }
    @PostMapping("/user")
    public Users addUser(@RequestBody Users user){
        Users user1=userService.addUser(user);
         return user1;

    }

    @PostMapping("/assign/{id}/profile")
    public Users assignProfile(@PathVariable("id") Long profileId,
                                  @RequestBody Profile profile){

        return userService.assignProfile(profileId, profile);

    }


    @PostMapping("/user/{userId}/blog")
    public Users assignBlog(@PathVariable("userId") Long userId,@RequestBody List<Blogs> blogs){
        return userService.assignBlog(userId,blogs);
    }







   @DeleteMapping("/user/{userId}")

    public String deleteUser(@PathVariable("id") Long userId){

        boolean flag=userService.deleteUsers(userId);

        if(flag)
           return("Deleted successFully");
        else
            return ("Deletion Error");
   }






}
