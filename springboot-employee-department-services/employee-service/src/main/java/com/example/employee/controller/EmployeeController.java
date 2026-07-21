package com.example.employee.controller;

import com.example.employee.dto.EmployeeRequestDto;
import com.example.employee.dto.EmployeeResponseDto;
import com.example.employee.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    
    @Value("${server.port}")
    private String serverPort;

    @PostMapping
    public ResponseEntity<EmployeeResponseDto> createEmployee(
            @Valid @RequestBody EmployeeRequestDto requestDto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(employeeService.createEmployee(requestDto));
    }

    @GetMapping
    public ResponseEntity<List<EmployeeResponseDto>> getAllEmployees() {
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping("/{eid}")
    public ResponseEntity<EmployeeResponseDto> getEmployeeById(
            @PathVariable Integer eid) {
        return ResponseEntity.ok(employeeService.getEmployeeById(eid));
    }

    @PutMapping("/{eid}")
    public ResponseEntity<EmployeeResponseDto> updateEmployee(
            @PathVariable Integer eid,
            @Valid @RequestBody EmployeeRequestDto requestDto) {
        return ResponseEntity.ok(employeeService.updateEmployee(eid, requestDto));
    }

    @DeleteMapping("/{eid}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer eid) {
        employeeService.deleteEmployee(eid);
        return ResponseEntity.noContent().build();
    }
    
    //for approach 2
    
//    @GetMapping("/department/{did}")
//    public ResponseEntity<Map<String , Object>> findByDid(@PathVariable Integer did){
//    	List<EmployeeResponseDto> employeeDtos = employeeService.findByDid(did);
//    	Map<String,Object> responMap = new HashMap<String, Object>();
//    	responMap.put("Port", serverPort);
//    	responMap.put("employeeDtos", employeeDtos);
//    	System.out.println("Port Handled :" +serverPort);
//    	
//    	return ResponseEntity.ok(responMap);
//    }
    
    @GetMapping("/department/{did}")
    public ResponseEntity<List<EmployeeResponseDto>> findBuDid(@PathVariable Integer did){
    	List<EmployeeResponseDto> employeeDtos = employeeService.findByDid(did);
    	return ResponseEntity.ok(employeeDtos);
    }
}
