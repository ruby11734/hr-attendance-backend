package com.example.attendance.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name="attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendance_id")
    private Long id;

    @Column(name="employee_id")
    private String employeeId;

    @Column(name="full_name")
    private String name;

    @Column(name = "attendance_date")
    private Date attendanceDate;
}