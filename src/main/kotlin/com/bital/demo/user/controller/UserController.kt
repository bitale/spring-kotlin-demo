package com.bital.demo.user.controller

import com.bital.demo.user.service.TestService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val testService: TestService,
) {

    @RequestMapping("/", method = [RequestMethod.GET])
    fun home(): String {
        return testService.printTest()
    }
}