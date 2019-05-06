package com.bms.admin.servce;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bms.admin.modal.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{

	@Override
	public Iterable<Student> allStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student saveEmployee(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		
	}

}
