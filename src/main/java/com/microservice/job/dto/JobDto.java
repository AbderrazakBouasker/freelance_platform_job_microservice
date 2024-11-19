package com.microservice.job.dto;

import lombok.Data;

@Data
public class JobDto {
    private String jobTitle;
    private String jobDescription;
    private Long jobProviderId;
    private Long jobReceiverId;
}
