package com.joe.angularweb.repository;

import com.joe.angularweb.model.Employee;
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
public class EmpRepositoryTest {

    @Autowired
    private EmpRepository empRepository;

    //@Test
    public void findOneTest() {
        Employee employee = empRepository.findOne(1);
        Assert.assertNotNull(employee);
    }

    //@Test
    public void findAllTest() {
        List<Employee> employeeList = empRepository.findAll();
        Assert.assertNotEquals(0,employeeList.size());

    }

    //@Test
    public void findByGenderTest(){
        List<Employee> employeeList = empRepository.findByGender("M");
        Assert.assertNotEquals(0,employeeList.size());
    }

    //@Test
    public void saveTest() {
        Employee employee = new Employee();
        employee.setEmpName("张三");
        employee.setDId(2);
        employee.setEmail("1234@qq.com");
        employee.setGender("男");
        Employee result = empRepository.save(employee);
        Assert.assertNotEquals(new Integer(0),result.getDId());
    }

}
