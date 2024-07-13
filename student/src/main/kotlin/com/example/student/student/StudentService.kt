package com.example.student.student

import com.netflix.discovery.converters.Auto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentService {
    @Autowired
    lateinit var studentRepository: StudentRepository

    @Autowired
    lateinit var gradesRepository: GradesRepository

    fun getAll():MutableList<Student>{
        return studentRepository.findAll()
    }

    fun getGradesByStudentId(id:Long):MutableList<Grades>{
        var student = studentRepository.findById(id).get()
        var grades = gradesRepository.getGradesByStudentId(student.id!!)
        return grades

    }


}