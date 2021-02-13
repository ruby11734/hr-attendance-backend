package com.example.attendance.mappers;

import com.example.attendance.dtos.AttendanceGetDto;
import com.example.attendance.dtos.AttendancePostDto;
import com.example.attendance.entities.Attendance;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface AttendanceMapper {
    Attendance checkIn(AttendancePostDto attendancePostDto);
    AttendanceGetDto getAttendances(Attendance attendance);
//    Person getPerson (PersonPostDto personPostDto);
}
