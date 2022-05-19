package com.example.educational.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int userId;
    private String userName;
    private String sex;
    private Date birthYear;
    private Date grade;
    private String collegeId;
}
