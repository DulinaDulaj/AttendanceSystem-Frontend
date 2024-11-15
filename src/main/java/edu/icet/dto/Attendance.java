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

    private String nic;
    private String name;
    private String course;
    private String date;

}
