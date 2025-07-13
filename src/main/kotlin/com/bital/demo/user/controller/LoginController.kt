package com.bital.demo.user.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class LoginController {
    @RequestMapping("/login")
    fun index(model: Model): String {
        model.addAttribute("hello", "test")
        return "login"
    }
}