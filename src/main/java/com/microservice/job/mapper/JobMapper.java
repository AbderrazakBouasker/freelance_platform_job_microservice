package com.microservice.job.mapper;

import com.microservice.job.dto.JobDto;
import com.microservice.job.model.JobEntity;

public class JobMapper {
    public static JobDto mapToJobDto(JobEntity jobEntity, JobDto jobDto) {
        jobDto.setJobTitle(jobEntity.getJobTitle());
        jobDto.setJobDescription(jobEntity.getJobDescription());
        jobDto.setJobProviderId(jobEntity.getJobProviderId());
        jobDto.setJobReceiverId(jobEntity.getJobReceiverId());
        jobDto.setJobStatus(jobEntity.getJobStatus());
        return jobDto;
    }

    public static JobEntity mapToJobEntity(JobDto jobDto, JobEntity jobEntity) {
        jobEntity.setJobTitle(jobDto.getJobTitle());
        jobEntity.setJobDescription(jobDto.getJobDescription());
        jobEntity.setJobProviderId(jobDto.getJobProviderId());
        jobEntity.setJobReceiverId(jobDto.getJobReceiverId());
        jobEntity.setJobStatus(jobDto.getJobStatus());
        return jobEntity;
    }
}
