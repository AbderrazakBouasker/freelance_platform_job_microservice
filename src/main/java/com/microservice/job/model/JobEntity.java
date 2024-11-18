package com.microservice.job.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobId;

    private String jobTitle;

    private String jobDescription;

    private Long jobProviderId;

    private Long jobReceiverId;

    @Transient
    private UserEntity jobProvider;

    @Transient
    private UserEntity jobReceiver;

}
