package com.niek125.projectconsumer.repository;

import com.niek125.projectconsumer.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<Project, String> {
}
