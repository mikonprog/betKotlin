package com.example.betKotlin

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class BetKotlinApplicationTests {

	@Autowired
	lateinit var testRestTemplate: TestRestTemplate

	@Test
	fun contextLoads() {
		val result = testRestTemplate.getForEntity("/hello", String::class.java)

		Assert.assertNotNull(result)
		Assert.assertEquals(result?.statusCode, HttpStatus.OK)
		Assert.assertEquals(result?.body, "Hello Kotlin service..!!")

	}

}
