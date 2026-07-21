package com.example.department.service;

import com.example.department.config.EmployeeClient;
import com.example.department.dao.DepartmentDao;
import com.example.department.dto.DepartmentRequestDto;
import com.example.department.dto.DepartmentResponseDto;
import com.example.department.dto.EmployeeDto;
import com.example.department.entity.Department;
import com.example.department.exception.DepartmentNotFoundException;
import com.example.department.exception.DuplicateResourceException;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentDao departmentDao;
   // private final RestTemplate restTemplate;
    private final EmployeeClient employeeClient;

    @Override
    public DepartmentResponseDto createDepartment(DepartmentRequestDto dto) {
        if (departmentDao.existsByName(dto.dname())) {
            throw new DuplicateResourceException(
                    "Department name already exists: " + dto.dname());
        }

        Department department = Department.builder()
                .dname(dto.dname())
                .location(dto.location())
                .build();

        return mapToResponse(departmentDao.save(department));
    }

    @Override
    @Transactional(readOnly = true)
    public List<DepartmentResponseDto> getAllDepartments() {
        return departmentDao.findAll()
                .stream()
                .map(this::mapToResponse)
                .toList();
    }

    @Override
    @Transactional(readOnly = true)
    public DepartmentResponseDto getDepartmentById(Integer did) {
        return mapToResponse(findDepartment(did));
    }

    @Override
    public DepartmentResponseDto updateDepartment(
            Integer did, DepartmentRequestDto dto) {

        Department department = findDepartment(did);

        if (departmentDao.existsByNameAndIdNot(dto.dname(), did)) {
            throw new DuplicateResourceException(
                    "Department name already exists: " + dto.dname());
        }

        department.setDname(dto.dname());
        department.setLocation(dto.location());

        return mapToResponse(departmentDao.save(department));
    }

    @Override
    public void deleteDepartment(Integer did) {
        Department department = findDepartment(did);
        departmentDao.delete(department);
    }

    private Department findDepartment(Integer did) {
        return departmentDao.findById(did)
                .orElseThrow(() ->
                        new DepartmentNotFoundException(
                                "Department not found with id: " + did));
    }

    private DepartmentResponseDto mapToResponse(Department department) {
        return new DepartmentResponseDto(
                department.getDid(),
                department.getDname(),
                department.getLocation()
        );
    }

	@Override
	@Transactional
	public Department getDepartmentWithEmployees(Integer did) {
		Department department = new Department();
		department = departmentDao.findById(did).get();
		List<EmployeeDto> empList = employeeClient.getEmployeesByDid(did);
		System.out.println(empList);
		if(empList ==null)
			empList = new ArrayList<EmployeeDto>();
		 department.setEmployees(empList);
		 return department;
	}
//approach with list method 1
//	@Override
//	public Department getDepartmentWithEmployees(Integer did) {
//		// TODO Auto-generated method stub
//		
//		
//		//get department of the given id 
//		Department department = departmentDao.findById(did).get();
//		
//		//url to call employeelist retriving api from employeeservice
//		String url="http://EMPLOYEE_SERVICE/api/employees/department/"+did;
//		//String url="http://localhost:8081/api/employees/department/"+did;
//	
//		//resttemplate will call the above url and set the response to empdto array
//		//embedded with response entity
//		
//		ResponseEntity<EmployeeDto[]> empDtos = restTemplate.getForEntity(url, EmployeeDto[].class);
//		List<EmployeeDto> empList = new ArrayList<EmployeeDto>();
//		EmployeeDto[] dtos = empDtos.getBody();//fetch emp array from response entity
//		for(EmployeeDto dto : dtos)
//			System.out.println(dto);
//		empList = Arrays.asList(dtos);
//		
//		//set list of employees data to empList in the department
//		department.setEmployees(empList);
//		return department;
//	}
    
   //approach with map method 2  
//    @Override
//    public Department getDepartmentWithEmployees(Integer did) {
//
//        // Get Department
//        Department department = departmentDao.findById(did)
//                .orElseThrow(() ->
//                        new DepartmentNotFoundException(
//                                "Department not found with id : " + did));
//
//        // Employee Service URL through Eureka
//        String url = "http://employee-service/api/employees/department/" + did;
//
//        // Call Employee Service
//        ResponseEntity<Map> response =
//                restTemplate.getForEntity(url, Map.class);
//
//        Map<String, Object> responseMap = response.getBody();
//
//        // Print which employee instance handled the request
//        System.out.println("Employee Service Port = "
//                + responseMap.get("port"));
//
//        // Fetch employeeDtos from response map
//        List<Map<String, Object>> employees =
//                (List<Map<String, Object>>) responseMap.get("employeeDtos");
//
//        List<EmployeeDto> empList = new ArrayList<>();
//
//        for (Map<String, Object> emp : employees) {
//
//            EmployeeDto dto = new EmployeeDto();
//
//            dto.setEid((Integer) emp.get("eid"));
//            dto.setEname((String) emp.get("ename"));
//
//            if (emp.get("salary") != null)
//                dto.setSalary(
//                        Double.valueOf(emp.get("salary").toString()));
//
//            dto.setMobile((String) emp.get("mobile"));
//            dto.setEmail((String) emp.get("email"));
//
//            empList.add(dto);
//
//            System.out.println(dto);
//        }
//
//        department.setEmployees(empList);
//
//        return department;
//    }
    
    
    
}
