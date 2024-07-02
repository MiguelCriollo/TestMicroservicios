package com.example.student.student

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "student")
data class Student(
    @Id
    var id: Long? = null,

    var firstname:String? = null,

    var lastname:String,

    var fullname:String,

    var age:Int



)