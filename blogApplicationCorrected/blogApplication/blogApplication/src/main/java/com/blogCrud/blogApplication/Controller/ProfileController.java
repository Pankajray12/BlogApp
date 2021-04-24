package com.blogCrud.blogApplication.Controller;

import com.blogCrud.blogApplication.Entity.Profile;
import com.blogCrud.blogApplication.Service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    ProfileService profileService;


    @GetMapping("/profiles")

    public List<Profile> getProfileDetails() {
        return profileService.getProfileDetails();
    }
  @PostMapping("/profile")
    public Profile addProfile(@RequestBody Profile profile) {
        Profile profile1=profileService.addProfile(profile);
        return profile1;
    }

}
