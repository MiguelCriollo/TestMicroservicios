package com.example.student.student

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

data class Grades(
    @Id
    var id: Long,

    var grade: Int,

    var comment: String,

    var studentId: Long

)
