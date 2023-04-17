package com.Library.data;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Worker {
    private long id;
    private String name;
    private int age;
    private String sex;
    private String position;
    private int workingYears;
}
