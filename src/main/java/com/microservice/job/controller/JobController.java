package com.microservice.job.controller;

import com.microservice.job.sevice.IJobService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class JobController {
    private IJobService jobService;

    // todo: add routes
}
