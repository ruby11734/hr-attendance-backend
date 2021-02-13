package com.example.attendance.controllers;

import com.example.attendance.dtos.AttendanceGetDto;
import com.example.attendance.dtos.AttendancePostDto;
import com.example.attendance.entities.Attendance;
import com.example.attendance.services.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:8081")
public class AttendanceController {
    private final AttendanceService attendanceService;

    @PostMapping
    public ResponseEntity<AttendanceGetDto> checkIn (@RequestBody AttendancePostDto attendancePostDto){
        System.out.println(attendancePostDto);
       AttendanceGetDto attendanceGetDto= attendanceService.checkIn(attendancePostDto);
        return ResponseEntity.ok(attendanceGetDto);
    }

    @GetMapping
    public ResponseEntity<List<Attendance>> getAttendances(){
        List<Attendance> attendances = attendanceService.getAttendance();
        return ResponseEntity.ok(attendances);
    }
}
