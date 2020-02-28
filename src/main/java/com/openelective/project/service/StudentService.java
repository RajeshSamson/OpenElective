package com.openelective.project.service;

import com.openelective.project.model.Student;
import com.openelective.project.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return this.studentRepository.findAll();
    }

    public Optional<Student> getByStudentId(String id) {
        return this.studentRepository.findById(id);
    }

    public Student createStudent(Student s) {
        return this.studentRepository.save(s);
    }

    public List<Student> getStudentsInSortedOrder(String group) {
        return this.studentRepository.findAllByGroupNameOrderByCgpaDescBacklogsAsc(group);
    }
}
