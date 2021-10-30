package com.example.springRest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springRest.Courses;
@Repository
public interface courseDao extends JpaRepository <Courses,Integer> {

}
