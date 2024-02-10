package com.prudhvi.departmentservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prudhvi.departmentservice.DTO.DepartmentDto;
import com.prudhvi.departmentservice.service.DepartmentService;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@RestController
@RequestMapping("api")
@CrossOrigin
public class DepartmentController {
	
	private DepartmentService departmentService;
	
	@PostMapping("/addDepartment")
	public ResponseEntity<DepartmentDto> saveDepartment(@RequestBody DepartmentDto departmentDto)
	{
		DepartmentDto saveDept=departmentService.saveDepartment(departmentDto);
		return new ResponseEntity<>(saveDept,HttpStatus.CREATED);
	}

}
