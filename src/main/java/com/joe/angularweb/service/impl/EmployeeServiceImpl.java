package com.joe.angularweb.service.impl;

import com.joe.angularweb.model.Employee;
import com.joe.angularweb.repository.EmpRepository;
import com.joe.angularweb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 180297 on 2017/12/13.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmpRepository empRepository;

    @Override
    public Employee findOne(Integer empId) {
        return empRepository.findOne(empId);
    }

    @Override
    public List<Employee> findAll() {
        return empRepository.findAll();
    }

    @Override
    public Employee save(Employee employee) {
        return empRepository.save(employee);
    }

    @Override
    public List<Employee> findByGender(String gender) {
        return empRepository.findByGender(gender);
    }

    @Override
    public void deleteByEmpId(Integer empId) {
        empRepository.delete(empId);
    }

}
