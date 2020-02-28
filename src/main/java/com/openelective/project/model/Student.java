package com.openelective.project.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "student")
@Data
public class Student {

    @Id
    @Column(name = "student_id")
    @NonNull
    private String id;

    @Column(name = "student_name")
    @NonNull
    private String name;

    @Column(name = "year")
    @NonNull
    private int year;

    @Column(name = "CGPA")
    @NonNull
    private double cgpa;

    @Column(name = "backlogs")
    @NonNull
    private int backlogs;

    @Column(name = "open_elective_1")
    private String OE1;

    @Column(name = "open_elective_2")
    private String OE2;

    @Column(name = "open_elective_3")
    private String OE3;

    @Column(name = "option_1")
    @NonNull
    private String OP1;

    @Column(name = "option_2")
    @NonNull
    private String OP2;

    @Column(name = "option_3")
    @NonNull
    private String OP3;

    @Column(name = "course_allocation")
    private boolean enable;

    @Column(name = "group_name")
    private String groupName = "std";

  /*  @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "allocation_id", referencedColumnName = "id")
    private AllocationStatus allocationStatus;*/

}
