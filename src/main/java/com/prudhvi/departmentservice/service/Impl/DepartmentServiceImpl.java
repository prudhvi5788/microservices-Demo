package com.prudhvi.departmentservice.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prudhvi.departmentservice.DTO.DepartmentDto;
import com.prudhvi.departmentservice.entity.Department;
import com.prudhvi.departmentservice.repository.DepartmentRepository;
import com.prudhvi.departmentservice.service.DepartmentService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {

	
	private DepartmentRepository departmentRepo;
	
	@Override
	public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
		// TODO Auto-generated method stub
		Department department=new Department();
		department.setDepartmentCode(departmentDto.getDepartmentCode());
		department.setDepartmentDesc(departmentDto.getDepartmentDescription());
		department.setDepartmentName(departmentDto.getDepartmentName());
		department.setId(departmentDto.getId());
		Department saveDepartment=departmentRepo.save(department);
		
		DepartmentDto savedDepartmentDto= new DepartmentDto(
				saveDepartment.getId(),
				saveDepartment.getDepartmentName(),
				saveDepartment.getDepartmentDesc(),
				saveDepartment.getDepartmentCode()	
				);
				
		return savedDepartmentDto;
	}
	
}
