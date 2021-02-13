package com.example.attendance.dtos;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class AttendanceGetDto {
    private Long id;
    private String employeeId;
    private String name;
    private Date attendanceDate;
}
