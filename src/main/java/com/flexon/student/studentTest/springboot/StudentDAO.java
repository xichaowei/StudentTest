package com.flexon.student.studentTest.springboot;

import java.util.*;

import org.springframework.stereotype.*;

@Component
public class StudentDAO {

	public static ArrayList<Student> flexonClass = new ArrayList<>();
	
	public StudentDAO() {
		flexonClass.add(new Student("Charlie","wei", null, "123", null, null, null));
		flexonClass.add(new Student("wue","aaa", null, "456", null, null, null));
		flexonClass.add(new Student("aa","lee", null, "789", null, null, null));
		
	}
	public Student getStudent(String newStudent) {
		Iterator<Student> it = flexonClass.iterator();
	       while (it.hasNext()) {
	           Student std = it.next();
	           if (std.getStudentID().equals(newStudent)) {
	               return std;
	           }
	       }
	       return null;
	}
	
	public Student addStudent(Student newStudent){
		flexonClass.add(newStudent);
		return newStudent;
	}
	
	public void changeStudent(Student newStudent,String studentID){
        Iterator<Student> stu = flexonClass.iterator(); 
		while(stu.hasNext()){
			Student temp = stu.next();
			if(temp.getStudentID().equals(studentID)){
				temp.setAddress(newStudent.getAddress());
				temp.setName(newStudent.getName());
				temp.setLastName(newStudent.getLastName());
				temp.setContactNumber(newStudent.getContactNumber());
				temp.setMajor(newStudent.getMajor());
				temp.setGender(newStudent.getGender());
			}
				
		}
		
	}
	public void deleteStudent(String studentID)
	{
		Iterator<Student> stu = flexonClass.iterator();
		while(stu.hasNext())
		{
			Student temp = stu.next();
			if(temp.getStudentID().equals(studentID))
			{
				flexonClass.remove(temp);
			}
		}
	}
	
	
}
