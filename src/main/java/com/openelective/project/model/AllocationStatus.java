package com.openelective.project.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "allocation_status")
@NoArgsConstructor
@AllArgsConstructor
public class AllocationStatus {

    @Id
    @Column(name = "student_id")
    private String id;

    @Column(name = "department")
    private String department;

    @Column(name = "course")
    private String course;

   /* @OneToOne(mappedBy = "allocation")
    private Student student;*/

}
