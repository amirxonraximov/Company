package com.example.lesson_1_task_1.repository;

import com.example.lesson_1_task_1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
