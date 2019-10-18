package com.flexon.student.studentTest.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class StudentController {

	@Autowired
	private StudentDAO studentService;
	
	@GetMapping("/getAllUser/{studentID}")
	public Student printAllStu(@PathVariable String studentID)
	{
		return studentService.getStudent(studentID);
	}
	
	@PostMapping("/AddUser")
	@ResponseStatus
	public void addStudent(@RequestBody Student students)
	{
		studentService.addStudent(students);
	}
	
	@PutMapping("/UpdateUser/{studentID}")
	@ResponseStatus
	public void changeStudent(@RequestBody Student students, @PathVariable String studentID)
	{
		studentService.changeStudent(students,studentID);
	}
	@DeleteMapping("/DeleteUser/{studentID}")
	@ResponseStatus
	public void deleteStudent(@PathVariable String studentID)
	{
		studentService.deleteStudent(studentID);
	}
}
