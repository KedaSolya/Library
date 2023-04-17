package com.Library.data;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
    private long id;
    private String name;
    private int age;
    private String sex;
}
