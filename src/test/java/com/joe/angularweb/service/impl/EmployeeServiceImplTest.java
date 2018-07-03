package com.joe.angularweb.service.impl;

import com.joe.angularweb.model.Employee;
import com.joe.angularweb.service.EmployeeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by 180297 on 2017/12/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceImplTest {

    @Autowired
    private EmployeeService employeeService;

    //@Test
    public void findOne() throws Exception {
        Employee employee = employeeService.findOne(1);
        Assert.assertNotEquals(new Integer(0),employee.getEmpId());
    }

    //@Test
    public void findAll() throws Exception {
        List<Employee> employeeList = employeeService.findAll();
        Assert.assertNotEquals(0,employeeList.size());
    }

    //@Test
    public void save() throws Exception {

        Employee employee = new Employee();
        employee.setEmpName("李四");
        employee.setDId(3);
        employee.setEmail("124554@qq.com");
        employee.setGender("男");
        Employee result = employeeService.save(employee);
        Assert.assertNotEquals(new Integer(0),result.getDId());

    }

    //@Test
    public void findByGender() throws Exception {
        List<Employee> employeeList = employeeService.findByGender("男");
        Assert.assertNotEquals(0,employeeList.size());
    }

    //@Test
    public void deleteEmployee() throws Exception {
        employeeService.deleteByEmpId(3);
    }

}
