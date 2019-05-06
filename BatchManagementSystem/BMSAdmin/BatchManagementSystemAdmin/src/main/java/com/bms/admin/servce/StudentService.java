package com.bms.admin.servce;

import com.bms.admin.modal.Student;

public interface StudentService {
		public Iterable<Student> allStudent();

	   public Student getEmployeeById(long id);

	   public Student saveEmployee(Student student);
	    
	   public void deleteStudent(long id);
}
