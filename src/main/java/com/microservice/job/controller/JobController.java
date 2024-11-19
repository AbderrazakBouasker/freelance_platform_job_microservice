package com.microservice.job.controller;

import com.microservice.job.dto.JobDto;
import com.microservice.job.sevice.IJobService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class JobController {
    private final IJobService jobService;

    @PostMapping("/create")
    public ResponseEntity<Void> createJob(@RequestBody JobDto jobDto) {
        jobService.createJob(jobDto);
        return ResponseEntity.status(201).build();
    }

    @PutMapping("/{jobId}")
    public ResponseEntity<Void> updateJob(@PathVariable Long jobId, @RequestBody JobDto jobDto) {
        jobService.updateJob(jobId, jobDto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{jobId}")
    public ResponseEntity<Void> deleteJob(@PathVariable Long jobId) {
        jobService.deleteJob(jobId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{jobId}")
    public ResponseEntity<JobDto> getJob(@PathVariable Long jobId) {
        JobDto jobDto = jobService.getJob(jobId);
        return ResponseEntity.ok(jobDto);
    }

    @GetMapping
    public ResponseEntity<List<JobDto>> getAllJobs() {
        List<JobDto> jobDtos = jobService.getAllJobs();
        return ResponseEntity.ok(jobDtos);
    }

    @GetMapping("/provider/{jobProviderId}")
    public ResponseEntity<List<JobDto>> getAllJobsByJobProvider(@PathVariable Long jobProviderId) {
        List<JobDto> jobDtos = jobService.getAllJobsByJobProvider(jobProviderId);
        return ResponseEntity.ok(jobDtos);
    }

    @GetMapping("/receiver/{jobReceiverId}")
    public ResponseEntity<List<JobDto>> getAllJobsByJobReceiver(@PathVariable Long jobReceiverId) {
        List<JobDto> jobDtos = jobService.getAllJobsByJobReceiver(jobReceiverId);
        return ResponseEntity.ok(jobDtos);
    }

    @GetMapping("/provider/{jobProviderId}/receiver/{jobReceiverId}")
    public ResponseEntity<List<JobDto>> getAllJobsByJobProviderAndJobReceiver(@PathVariable Long jobProviderId, @PathVariable Long jobReceiverId) {
        List<JobDto> jobDtos = jobService.getAllJobsByJobProviderAndJobReceiver(jobProviderId, jobReceiverId);
        return ResponseEntity.ok(jobDtos);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<JobDto>> getAllJobsByUser(@PathVariable Long userId) {
        List<JobDto> jobDtos = jobService.getAllJobsByUser(userId);
        return ResponseEntity.ok(jobDtos);
    }
}