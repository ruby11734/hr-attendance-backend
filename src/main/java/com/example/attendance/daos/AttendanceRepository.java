package com.example.attendance.daos;

import com.example.attendance.entities.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
}
