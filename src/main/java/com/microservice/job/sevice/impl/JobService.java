package com.microservice.job.sevice.impl;

import com.microservice.job.dto.JobDto;
import com.microservice.job.mapper.JobMapper;
import com.microservice.job.model.JobEntity;
import com.microservice.job.repository.JobRepository;
import com.microservice.job.sevice.IJobService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
//todo: Implement error handling in a better way using ErrorResponseDto and GlobalExceptionHandler

@Service
@AllArgsConstructor
public class JobService implements IJobService {

    private JobRepository jobRepository;

    /**
     * Create a new job
     *
     * @param jobDto
     */
    @Override
    public void createJob(JobDto jobDto) {
        // map jobDto to jobEntity
        JobEntity jobEntity = new JobEntity();
        JobMapper.mapToJobEntity(jobDto, jobEntity);

        // save jobEntity
        jobRepository.save(jobEntity);

    }

    /**
     * Update a job
     *
     * @param jobId
     * @param jobDto
     */
    @Override
    public void updateJob(Long jobId, JobDto jobDto) {

        // get Job from repository
        JobEntity jobEntity = jobRepository.findById(jobId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Job not found"));

        // map jobDto to jobEntity
        JobMapper.mapToJobEntity(jobDto, jobEntity);

        // save jobEntity
        jobRepository.save(jobEntity);
    }

    /**
     * Delete a job
     *
     * @param jobId
     */
    @Override
    public void deleteJob(Long jobId) {
        // get Job from repository
        JobEntity jobEntity = jobRepository.findById(jobId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Job not found"));

        // delete jobEntity
        jobRepository.delete(jobEntity);

    }

    /**
     * Get a job
     *
     * @param jobId
     */
    @Override
    public JobDto getJob(Long jobId) {
        // get Job from repository
        JobEntity jobEntity = jobRepository.findById(jobId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Job not found"));

        // map jobEntity to jobDto
        JobDto jobDto = new JobDto();
        JobMapper.mapToJobDto(jobEntity, jobDto);

        return jobDto;
    }

    /**
     * Get all jobs
     */
    @Override
    public List<JobDto> getAllJobs() {
        // get all jobs from repository
        List<JobEntity> jobEntities = jobRepository.findAll();

        // map jobEntities to jobDtos
        List<JobDto> jobDtos = List.of();
        for (JobEntity jobEntity : jobEntities) {
            JobDto jobDto = new JobDto();
            JobMapper.mapToJobDto(jobEntity, jobDto);
            jobDtos.add(jobDto);
        }

        return jobDtos;

    }

    /**
     * Get all jobs by job provider
     *
     * @param jobProviderId
     */
    @Override
    public List<JobDto> getAllJobsByJobProvider(Long jobProviderId) {
        // get all jobs by job provider from repository
        List<JobEntity> jobEntities = jobRepository.findByJobProviderId(jobProviderId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Job not found"));

        // map jobEntities to jobDtos
        List<JobDto> jobDtos = List.of();
        for (JobEntity jobEntity : jobEntities) {
            JobDto jobDto = new JobDto();
            JobMapper.mapToJobDto(jobEntity, jobDto);
            jobDtos.add(jobDto);
        }

        return jobDtos;
    }

    /**
     * Get all jobs by job receiver
     *
     * @param jobReceiverId
     */
    @Override
    public List<JobDto> getAllJobsByJobReceiver(Long jobReceiverId) {
        // get all jobs by job receiver from repository
        List<JobEntity> jobEntities = jobRepository.findByJobReceiverId(jobReceiverId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Job not found"));

        // map jobEntities to jobDtos
        List<JobDto> jobDtos = List.of();
        for (JobEntity jobEntity : jobEntities) {
            JobDto jobDto = new JobDto();
            JobMapper.mapToJobDto(jobEntity, jobDto);
            jobDtos.add(jobDto);
        }

        return jobDtos;
    }

    /**
     * Get all jobs by job provider and job receiver
     *
     * @param jobProviderId
     * @param jobReceiverId
     */
    @Override
    public List<JobDto> getAllJobsByJobProviderAndJobReceiver(Long jobProviderId, Long jobReceiverId) {
        // get all jobs by job provider and job receiver from repository
        List<JobEntity> jobEntities = jobRepository.findByJobReceiverIdAndJobProviderId(jobReceiverId, jobProviderId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Job not found"));

        // map jobEntities to jobDtos
        List<JobDto> jobDtos = List.of();
        for (JobEntity jobEntity : jobEntities) {
            JobDto jobDto = new JobDto();
            JobMapper.mapToJobDto(jobEntity, jobDto);
            jobDtos.add(jobDto);
        }

        return jobDtos;
    }
}
