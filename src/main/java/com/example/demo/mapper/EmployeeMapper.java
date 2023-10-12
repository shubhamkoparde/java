package com.example.demo.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;

import com.example.demo.sub.Employee;
@Mapper
public interface EmployeeMapper {
    List<Employee> getAll();
    
    Employee getbyID(int id);

	

	void deleteById(int id);

	List<Employee> findEmpByDep(String depName);

	 int insert(Employee employee);

	int update(Employee employees);

}
