package com.springboot.SpringBoot.service;

import com.springboot.SpringBoot.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentByID(Long departmentID);

    public void deleteDepartmentByID(Long departmentID);

    public Department updateDepartment(Long departmentID, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
