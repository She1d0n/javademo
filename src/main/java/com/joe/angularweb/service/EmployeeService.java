package com.joe.angularweb.service;

import com.joe.angularweb.model.Employee;

import java.util.List;

/**
 * Created by 180297 on 2017/12/13.
 */
public interface EmployeeService {

    Employee findOne(Integer empId);

    List<Employee> findAll();

    Employee save(Employee employee);

    List<Employee> findByGender(String gender);

    void deleteByEmpId(Integer empId);


}
