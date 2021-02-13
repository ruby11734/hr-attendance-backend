package com.example.attendance.services;

import com.example.attendance.daos.AttendanceRepository;
import com.example.attendance.dtos.AttendanceGetDto;
import com.example.attendance.dtos.AttendancePostDto;
import com.example.attendance.entities.Attendance;
import com.example.attendance.mappers.AttendanceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AttendanceService {
    private final AttendanceRepository attendanceRepository;
    private final AttendanceMapper attendanceMapper;

    public AttendanceGetDto checkIn(AttendancePostDto attendancePostDto){
        Attendance attendanceEntity = attendanceMapper.checkIn(attendancePostDto);
        return attendanceMapper.getAttendances(attendanceRepository.save(attendanceEntity));
    }

    public List<Attendance> getAttendance(){
        return attendanceRepository.findAll();
    }
}
