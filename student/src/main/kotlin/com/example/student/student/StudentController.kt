package com.example.student.student

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/student")
class StudentController {
    @Autowired
    lateinit var studentService: StudentService

    @GetMapping("/all")
    fun getAllStudents():MutableList<Student>{
        return studentService.getAll()
    }

    @GetMapping("/search_student/{id}")
    fun getStudentById(@PathVariable id:Long):MutableList<Grades>{
        return studentService.getGradesByStudentId(id)
    }

}