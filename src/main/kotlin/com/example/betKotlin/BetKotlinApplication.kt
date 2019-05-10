package com.example.betKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class BetKotlinApplication

fun main(args: Array<String>) {
	runApplication<BetKotlinApplication>(*args)

}

@RestController
class HelloController(val helloService: HelloService) {

	@GetMapping("/hello")
	fun helloKotlin(): String {
		return helloService.getHello()
	}
}

@Service
class HelloService {

	fun getHello(): String {
		return "Hello Kotlin service..!!"
	}
}