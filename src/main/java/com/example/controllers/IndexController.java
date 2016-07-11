package com.example.controllers;

import com.example.domain.User;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    String index(Model model) {
        User user = new User("aleks", 20);
        System.out.println(user.toString());
        userRepository.save(user);

        User newUser = new User();
        newUser = userRepository.findOneByName("aleks");
        System.out.println(newUser.toString());
        model.addAttribute("user", newUser);
        return "index";
    }
}
