package com.example.mmm.controller;

import com.example.mmm.model.User;
import com.example.mmm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

    private final UserService userService;

    @Autowired
    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }

    @PostMapping("/register")
    public String handleRegister(@RequestParam String username,
                                 @RequestParam String email,
                                 @RequestParam String password,
                                 @RequestParam String confirmPassword,
                                 Model model) {

        if (!password.equals(confirmPassword)) {
            model.addAttribute("error", "Passwords do not match!");
            return "register";
        }

        if (userService.getUserByUsername(username).isPresent()) {
            model.addAttribute("error", "Username is already taken!");
            return "register";
        }

        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

        userService.createUser(user);

        return "redirect:/login";
    }
}