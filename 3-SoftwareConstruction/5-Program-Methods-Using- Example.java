package com.lab9.airstatechecker.controller;

import com.lab9.airstatechecker.entity.AirConditionStateAnswer;
import com.lab9.airstatechecker.entity.AirConditionStateRequest;
import com.lab9.airstatechecker.entity.EFreshAir;
import com.lab9.airstatechecker.entity.User;
import com.lab9.airstatechecker.service.AnswerService;
import com.lab9.airstatechecker.service.EFreshAirService;
import com.lab9.airstatechecker.service.RequestService;
import com.lab9.airstatechecker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
//маємо клас контроллеру, що обробляє всі запити
@Controller
public class MyController {
    private EFreshAirService eFreshAirService;
    private UserService userService;
    private RequestService requestService;
    private AnswerService answerService;

    @Autowired
    public MyController(EFreshAirService eFreshAirService, UserService userService, RequestService requestService, AnswerService answerService) {
        this.eFreshAirService = eFreshAirService;
        this.userService = userService;
        this.requestService = requestService;
        this.answerService = answerService;
    }

    @RequestMapping("/")
    public String login() {
        return "login";
    }
    @PostMapping("/doLogin")
    public String doLogin(@RequestParam String username, @RequestParam String password) {
        if (username.equals("Andrii") && password.equals("123456")) {
            userService.save(new User("Andrii", "john.doe@example.com", "New York"));
            return "main-page";
        }
        return "login";
    }

    //а ось тут маємо функцію для отримання інформації про стан повітря, що потім передається як атрибут моделі для відображення на наступній сторінці
  
    @PostMapping("/air-info")
    public String airStateInfo(@RequestParam String username, @RequestParam String location, Model model) {

        EFreshAir eFreshAir = new EFreshAir();
        String airInfo = eFreshAir.getAirStateInfo(location);
        model.addAttribute("airInfo", airInfo);

        return "air-info";
    }

}
