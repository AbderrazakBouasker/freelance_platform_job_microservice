package com.microservice.job.mapper;

import com.microservice.job.dto.JobDto;
import com.microservice.job.dto.UserDto;
import com.microservice.job.model.JobEntity;
import com.microservice.job.model.UserEntity;

public class JobMapper {
    public static JobDto mapToJobDto(JobEntity jobEntity, JobDto jobDto) {
        jobDto.setJobTitle(jobEntity.getJobTitle());
        jobDto.setJobDescription(jobEntity.getJobDescription());
        jobDto.setJobProviderId(jobEntity.getJobProviderId());
        jobDto.setJobReceiverId(jobEntity.getJobReceiverId());
        return jobDto;
    }

    public static JobEntity mapToJobEntity(JobDto jobDto, JobEntity jobEntity) {
        jobEntity.setJobTitle(jobDto.getJobTitle());
        jobEntity.setJobDescription(jobDto.getJobDescription());
        jobEntity.setJobProviderId(jobDto.getJobProviderId());
        jobEntity.setJobReceiverId(jobDto.getJobReceiverId());
        return jobEntity;
    }
}
