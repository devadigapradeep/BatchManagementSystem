package com.bms.admin.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bms.admin.modal.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long>{

}
