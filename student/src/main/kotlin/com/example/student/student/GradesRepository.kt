package com.example.student.student

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "gradesClient", url = "http://localhost:8080/grades/")
public interface GradesRepository {
    @GetMapping("/search_student/{id}")
    fun getGradesByStudentId(@PathVariable("id") id:Long):MutableList<Grades>
}