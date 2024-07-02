package com.example.grades.grades

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "grades")
data class Grades(
    @Id
    var id: Long,

    var grade: Int,

    var comment: String,

    var student_id: Long

)
