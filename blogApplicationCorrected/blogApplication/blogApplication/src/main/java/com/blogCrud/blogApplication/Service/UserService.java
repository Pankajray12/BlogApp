package com.blogCrud.blogApplication.Service;

import com.blogCrud.blogApplication.Entity.Blogs;
import com.blogCrud.blogApplication.Entity.Profile;
import com.blogCrud.blogApplication.Entity.Users;
import com.blogCrud.blogApplication.Repository.BlogRepository;
import com.blogCrud.blogApplication.Repository.ProfileRepository;
import com.blogCrud.blogApplication.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ProfileRepository profileRepository;
    @Autowired
    BlogRepository blogRepository;

    public List<Users> getUserDetails() {
        List<Users> user=userRepository.findAll();
        return user;
    }

    public Users addUser(Users user) {
        Users user1=userRepository.save(user);
        return user1;
    }

    public boolean deleteUsers(long userId) {
        Users deletedUser=userRepository.findById(userId).get();

        if(deletedUser!=null)
            return true;
        return false;
    }

    public Users assignProfile(long userId, Profile profile) {

        Users user=userRepository.findById(userId).get();
        profile.setUser(user);
        profileRepository.save(profile);
        user.setProfile(profile);
        userRepository.save(user);
        return user;

    }

    public Users updateUsers(Users user) {
        Users user1 = userRepository.findById(user.getUserId()).get();
        user1.setUserName(user.getUserName());
        userRepository.save(user1);
        return user1;

    }
@Transactional
    public Users assignBlog(Long userId, List<Blogs> blogs) {
        Users user=userRepository.findById(userId).get();

        //blogRepository.save(blog);

        for(Blogs blog:blogs) {
            user.addBlog(blog);
            blog.setUser(user);
            //userRepository.save(user);
            blogRepository.save(blog);
        }
        return user;

    }

//    public void addReviewForCourse(Long courseId, List<Review> reviews) {
//        Course course = courseRepository.findById(103L).get();
////      log.info("course.getReviews() --> {}",course.getReviewList());
//
//        for(Review review : reviews){
//            course.addReview(review);
//            review.setCourse(course);
//
//        }
//
//    }

}
