package edu.icet.service;

import edu.icet.dto.Attendance;
import edu.icet.dto.Course;
import edu.icet.entity.AttendanceEntity;
import edu.icet.repository.AttendanceRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class AttendanceServiceImpl implements AttendanceService{

    private final AttendanceRepository repository;
    private final ModelMapper mapper;

    @Override
    public void addAttendance(Attendance attendance) {
        repository.save(mapper.map(attendance, AttendanceEntity.class));
    }
}
