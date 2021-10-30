package com.example.springRest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springRest.dao.courseDao;

@Service
public class CourseServiceImpl implements CourseService {
    List <Courses> list;
    @Autowired
    private courseDao cd;
	public CourseServiceImpl() {
		list =new ArrayList <> ();
		list.add(new Courses(145,"java","this"));
		list.add(new Courses(14567,"javadfghh","thiscssjj"));
	}
	
	@Override
	public List <Courses> getCourse(){
        return cd.findAll();
    }
	
	 @Override 
	 public Courses addCourse(Courses course){ 
		 Courses entity=cd.save(course);
		 return entity;
	 }
	 
	 @Override 
	 public Courses updateCourse(Courses course){ 
		 cd.save(course);
		 return course;
	 }
	 
		
	@Override 
	public void deleteCourse(int parselong){ 
		cd.deleteById(parselong);
	    
	}
	
}
