package com.example.educational.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private int userId;
    private String userName;
    private String sex;
    private Date birthYear;
    private String degree;
    private String title;
    private Date grade;
    private String collegeName;

}
