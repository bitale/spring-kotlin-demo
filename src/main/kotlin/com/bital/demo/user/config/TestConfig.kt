package com.bital.demo.user.config

import com.bital.demo.user.service.TestService
import org.springframework.boot.SpringBootConfiguration
import org.springframework.context.annotation.Bean

@SpringBootConfiguration
class TestConfig {
    @Bean
    fun testService() = TestService()


}