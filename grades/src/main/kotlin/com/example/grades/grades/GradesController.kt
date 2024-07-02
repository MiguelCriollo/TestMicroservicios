package com.example.grades.grades

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/grades")
class GradesController {

    @Autowired
    lateinit var gradesRepository: GradesRepository

    @GetMapping("/all")
    fun getAllGrades():MutableList<Grades>{
        return gradesRepository.findAll()
    }

}