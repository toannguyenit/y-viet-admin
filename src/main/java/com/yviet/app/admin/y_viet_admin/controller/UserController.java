package com.yviet.app.admin.y_viet_admin.controller;

import com.yviet.app.admin.y_viet_admin.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public String login(@RequestParam String email, @RequestParam String password) {
        return  userService.authenticateUser(email,password);
    }

    @GetMapping("/demo")
    @PreAuthorize("hasAuthority('Admins')")
    public String demo() {
        return "demo";
    }

}
