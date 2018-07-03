package com.joe.angularweb.repository;

import com.joe.angularweb.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by 180297 on 2017/12/13.
 */
public interface EmpRepository extends JpaRepository<Employee,Integer> {
    //根据性别查找
    List<Employee> findByGender(String gender);
}
