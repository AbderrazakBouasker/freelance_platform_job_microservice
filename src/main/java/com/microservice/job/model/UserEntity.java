package com.microservice.job.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class UserEntity {

    private Long userId;
    private String userName;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String description;
    private String education;
    private String profileImage;
    private String role;
    private String accountStatus;
    // todo: find a way to make this relation in an easy way
//    @OneToOne
//    private PortfolioEntity portfolio;
}
