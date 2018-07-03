package com.joe.angularweb.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by 180297 on 2017/12/13.
 */
@Entity
@Data
@Table(name = "tbl_emp")
public class Employee {

    @Id
    @GeneratedValue
    private Integer empId;

    private String empName;

    private String gender;

    private String email;

    private Integer dId;

}
