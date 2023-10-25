package com.springboot.SpringBoot.repository;

import com.springboot.SpringBoot.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // since there is no default method to implement this function we use "findBy" followed by the name of the entity
    // in order to ignore the casing of the url instead of naming this method below one use "findByDepartmentNameIgnoreCase"
    // more methods can be found here : https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
    // in case there are complex queries then we can use JPQL or native SQL queries also using the @Query() annotation
    public Department findByDepartmentName(String departmentName);
}
