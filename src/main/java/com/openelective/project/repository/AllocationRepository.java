package com.openelective.project.repository;

import com.openelective.project.model.AllocationStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationRepository extends JpaRepository<AllocationStatus,String> {

}
