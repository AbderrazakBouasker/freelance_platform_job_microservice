package com.microservice.job.repository;

import com.microservice.job.model.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface JobRepository extends JpaRepository<JobEntity, Long> {
    // find jobs by job receiver id
    Optional<List<JobEntity>> findByJobReceiverId(Long jobReceiverId);

    // find jobs by job provider id
    Optional<List<JobEntity>> findByJobProviderId(Long jobProviderId);

    // find jobs by job receiver id and job provider id
    Optional<List<JobEntity>> findByJobReceiverIdAndJobProviderId(Long jobReceiverId, Long jobProviderId);
}
