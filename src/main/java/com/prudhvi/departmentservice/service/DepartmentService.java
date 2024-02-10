package com.prudhvi.departmentservice.service;

import com.prudhvi.departmentservice.DTO.DepartmentDto;

public interface DepartmentService {
	DepartmentDto saveDepartment(DepartmentDto departmentDto);
	
	DepartmentDto getDepartmentDetails(Long id);
}
