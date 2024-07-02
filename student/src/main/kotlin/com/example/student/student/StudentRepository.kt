package com.example.student.student

import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository: JpaRepository<Student,Long> {
}