package com.microservice.job.sevice;

import com.microservice.job.dto.JobDto;

import java.util.List;

public interface IJobService {

    /**
     * Create a new job
     * @param jobDto
     */
    void createJob(JobDto jobDto);

    /**
     * Update a job
     * @param jobDto
     */
    void updateJob(Long jobId, JobDto jobDto);

    /**
     * Delete a job
     * @param jobId
     */
    void deleteJob(Long jobId);

    /**
     * Get a job
     * @param jobId
     */
    JobDto getJob(Long jobId);

    /**
     * Get all jobs
     */
    List<JobDto> getAllJobs();

    /**
     * Get all jobs by job provider
     * @param jobProviderId
     */
    List<JobDto> getAllJobsByJobProvider(Long jobProviderId);

    /**
     * Get all jobs by job receiver
     * @param jobReceiverId
     */
    List<JobDto> getAllJobsByJobReceiver(Long jobReceiverId);

    /**
     * Get all jobs by job provider and job receiver
     * @param jobProviderId
     * @param jobReceiverId
     */
    List<JobDto> getAllJobsByJobProviderAndJobReceiver(Long jobProviderId, Long jobReceiverId);

    /**
     * Get all jobs by job provider or job receiver
     * @param userId
     */
    List<JobDto> getAllJobsByUser(Long userId);

}
