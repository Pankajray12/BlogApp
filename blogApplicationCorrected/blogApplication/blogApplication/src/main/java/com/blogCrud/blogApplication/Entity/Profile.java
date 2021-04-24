package com.blogCrud.blogApplication.Entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Profile {
    @Id
    long profileId;
    String profileDescription;
    @OneToOne
    private Users user;
}
