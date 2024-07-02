package com.example.grades.grades

import org.springframework.data.jpa.repository.JpaRepository

interface GradesRepository: JpaRepository<Grades, Long> {
}