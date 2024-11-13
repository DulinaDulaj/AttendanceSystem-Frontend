package edu.icet.controller;
import edu.icet.dto.Attendance;
import edu.icet.dto.Course;
import edu.icet.service.AttendanceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("attendance")
@RequiredArgsConstructor
@CrossOrigin

public class AttendanceController {
    final AttendanceService service;

    @PostMapping("/add-attendance")
    public void addAttendance(@RequestBody Attendance attendance) {
        service.addAttendance(attendance);

    }
}
