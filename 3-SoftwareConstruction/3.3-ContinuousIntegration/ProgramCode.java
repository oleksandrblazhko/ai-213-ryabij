package com.lab9.airstatechecker.controller;

import com.lab9.airstatechecker.entity.EFreshAir;
import com.lab9.airstatechecker.service.AnswerService;
import com.lab9.airstatechecker.service.EFreshAirService;
import com.lab9.airstatechecker.service.RequestService;
import com.lab9.airstatechecker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
public class MyController {
    private final EFreshAirService eFreshAirService;
    private final UserService userService;
    private final RequestService requestService;
    private final AnswerService answerService;

    @Autowired
    public MyController(
            final EFreshAirService eFreshAirService,
            final UserService userService,
            final RequestService requestService,
            final AnswerService answerService
    ) {
        this.eFreshAirService = eFreshAirService;
        this.userService = userService;
        this.requestService = requestService;
        this.answerService = answerService;
    }

    @RequestMapping("/")
    public String login() {
        // method code
        return "login";
    }

    @PostMapping("/doLogin")
    public String doLogin(@RequestParam final String username, @RequestParam final String password) {
        if ("Andrii".equals(username) && "123456".equals(password)) {
            userService.save(new User("Andrii", "john.doe@example.com", "New York"));
            return "main-page";
        }
        return "login";
    }

    @PostMapping("/air-info")
    public String airStateInfo(@RequestParam final String username, @RequestParam final String location, Model model) {
        EFreshAir eFreshAir = new EFreshAir();
        String airInfo = eFreshAir.getAirStateInfo(username, location);
        model.addAttribute("airInfo", airInfo);
        return "air-info";
    }
}
