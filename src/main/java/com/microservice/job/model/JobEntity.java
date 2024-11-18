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

    private int jobProviderId;

    private int jobReceiverId;

    @Transient
    private JobEntity jobProvider;

    @Transient
    private JobEntity jobReceiver;

}
