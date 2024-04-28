package com.javaproject.h2.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.h2.api.module.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{

}
