package com.blogCrud.blogApplication.Repository;

import com.blogCrud.blogApplication.Entity.Profile;
import com.blogCrud.blogApplication.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Long> {

}
