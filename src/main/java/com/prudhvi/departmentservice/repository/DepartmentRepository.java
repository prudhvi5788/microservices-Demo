package com.prudhvi.departmentservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.prudhvi.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
	Optional<Department> findById(Long id);
}
