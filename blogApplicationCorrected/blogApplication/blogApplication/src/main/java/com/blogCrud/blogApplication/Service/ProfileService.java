package com.blogCrud.blogApplication.Service;

import com.blogCrud.blogApplication.Entity.Profile;
import com.blogCrud.blogApplication.Entity.Users;
import com.blogCrud.blogApplication.Repository.ProfileRepository;
import org.aspectj.lang.annotation.SuppressAjWarnings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    @Autowired
    ProfileRepository profileRepository;
    public List<Profile> getProfileDetails() {
        List<Profile> user=profileRepository.findAll();
        return user;
    }

    public Profile addProfile(Profile profile) {
        Profile profile1=profileRepository.save(profile);
        return profile1;
    }






}
