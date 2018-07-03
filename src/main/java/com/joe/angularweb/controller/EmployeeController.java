package com.joe.angularweb.controller;

import com.joe.angularweb.model.Employee;
import com.joe.angularweb.service.EmployeeService;
import com.joe.angularweb.utils.ResultVOUtil;
import com.joe.angularweb.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 180297 on 2017/12/13.
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/emp/list")
    public ResultVO<List<Employee>> list() {
        List<Employee> employeeList = employeeService.findAll();
        return ResultVOUtil.success(employeeList);
    }

    @GetMapping(value = "/emp/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResultVO<Employee> getEmployee(@PathVariable("id")Integer id){
        Employee employee = employeeService.findOne(id);
        if (employee == null) {
            return ResultVOUtil.error(400,"未找到相关记录");
        }
        return ResultVOUtil.success(employee);
    }

    @PostMapping("/emp/save")
    public ResultVO<Employee> save(@RequestBody Employee employee) {
        Employee result = employeeService.save(employee);
        return ResultVOUtil.success(result);
    }

    @DeleteMapping("/emp/del/{empId}")
    public ResultVO delEmp(@PathVariable("empId")Integer empId){
        employeeService.deleteByEmpId(empId);
        return ResultVOUtil.success();
    }



}
