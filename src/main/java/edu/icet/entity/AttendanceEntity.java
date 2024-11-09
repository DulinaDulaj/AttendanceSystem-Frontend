package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "attendance")

public class AttendanceEntity {
    @Id
    private String atId;
    private LocalDate date;
    private String stId;
    private String stName;
    private String courseName;
    private String status;
}
