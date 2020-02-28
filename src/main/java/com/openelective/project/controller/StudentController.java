package com.openelective.project.controller;

import com.openelective.project.model.Student;
import com.openelective.project.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/sorted")
    public List<Student> getStudentsInSortedOrder(@RequestParam String group) {
        return studentService.getStudentsInSortedOrder(group);
    }

    @GetMapping("/{id}")
    public Optional<Student> getAllStudents(@PathVariable String id) {
        return studentService.getByStudentId(id);
    }

    @PostMapping("/save")
    public Student create(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
}
