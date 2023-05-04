package com.kassim.StudentCRUDV1.repository;

import com.kassim.StudentCRUDV1.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
