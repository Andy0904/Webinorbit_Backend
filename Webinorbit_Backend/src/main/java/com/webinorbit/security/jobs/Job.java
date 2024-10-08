package com.webinorbit.security.jobs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Job {

    @Id
    private Long id;  // Manually set this ID

    private String companyName;
    private String companyLogo;
    private String jobType;
    private String role;
    private String location;
    private String duration;
    private String batch;
    private String salary;
    private String description;
    private String applyLink;
}