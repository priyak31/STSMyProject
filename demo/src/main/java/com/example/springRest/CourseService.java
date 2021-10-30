package com.example.springRest;

import java.util.List;

public interface CourseService {
	
	public List <Courses> getCourse();
	public Courses addCourse(Courses course);
	public Courses updateCourse(Courses course);
	public void deleteCourse(int parselong); 


}
