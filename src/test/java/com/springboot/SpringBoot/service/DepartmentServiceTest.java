package com.springboot.SpringBoot.service;

import com.springboot.SpringBoot.entity.Department;
import com.springboot.SpringBoot.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {
    @Autowired
    private DepartmentService departmentService;

    // we need to mock the data from the repository layer as we only need to check the
    // service layer and not test the repository layer
    @MockBean
    private DepartmentRepository departmentRepository;
    @BeforeEach
    void setUp() {
        Department department =
                Department.builder()
                        .departmentName("CE")
                        .departmentAddress("CHENNAI")
                        .departmentCode("CE-07")
                        .departmentId(2L).build();
        Mockito.when(departmentRepository.findByDepartmentName("CE"))
                .thenReturn(department);
    }

    @Test
    // to disable test cas use @Disabled annotation
    // when displaying the data we can give the better name to this test
    @DisplayName("Get Data based on valid department name")
    public void whenValidDepartmentName_thenDepartmentShouldFound() {
        String departmentName = "CE";
        Department found = departmentService.fetchDepartmentByName(departmentName);

        assertEquals(departmentName, found.getDepartmentName());
    }
}