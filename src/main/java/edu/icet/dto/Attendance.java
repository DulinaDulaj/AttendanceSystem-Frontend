package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class Attendance {

    private LocalDate date;
    private String stId;
    private String stName;
    private String courseName;
    private String status;

}
