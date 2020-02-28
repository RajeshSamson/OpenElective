package com.openelective.project.repository;

import com.openelective.project.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Native;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

    List<Student> findAllByGroupNameOrderByCgpaDescBacklogsAsc(String group);

}
