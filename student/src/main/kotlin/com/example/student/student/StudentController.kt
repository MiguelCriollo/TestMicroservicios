package com.example.student.student

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/student")
class StudentController {
    @Autowired
    lateinit var studentRepository: StudentRepository

    @GetMapping("/all")
    fun getAllStudents():MutableList<Student>{
        return studentRepository.findAll()
    }

}