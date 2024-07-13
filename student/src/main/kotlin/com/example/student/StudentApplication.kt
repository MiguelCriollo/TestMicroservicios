package com.example.student

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class StudentApplication

fun main(args: Array<String>) {
	runApplication<StudentApplication>(*args)
}
