package com.microservice.job.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class ResponseDto {

    private String StatusCode;

    private String StatusMsg;
}
