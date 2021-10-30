package com.example.springRest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;*/
import org.springframework.web.bind.annotation.*;
@RestController
public class MyController {
@Autowired
private CourseService courseService;

@GetMapping("/home")
public String home() {
	return "hii";
}

@GetMapping("/courses")
public List<Courses> getCourses() {
	return this.courseService.getCourse();
}

@PostMapping("/courses")
public Courses add(@RequestBody Courses course) {
	return this.courseService.addCourse(course);
}

@PutMapping("/courses/{courseId}")
public Courses update(@PathVariable long courseId, @RequestBody Courses course) {
	return this.courseService.updateCourse(course);
}

@DeleteMapping("/courses")
public /*ResponseEntity<HttpStatus> */ void deleteCourse(@RequestParam int courseId) {
	/*
	 * try { this.courseService.deleteCourse(Long.parseLong(courseId)); return new
	 * ResponseEntity<>(HttpStatus.OK); } catch(Exception e) { return new
	 * ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	 * 
	 * }
	 */
	this.courseService.deleteCourse(courseId);
	
}

}
