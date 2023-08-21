package com.soulcode.goserviceapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/auth")
public class AuthController {

    //Jeito 1
    @GetMapping(value = "/login")
    public ModelAndView login() {
        ModelAndView login = new ModelAndView();
        login.setViewName("login");
        return login;
    }

    //Jeito 2
    @GetMapping(value = "/cadastro")
    public ModelAndView cadastro(){
        ModelAndView cadastro = new ModelAndView("cadastro");
        return cadastro;
    }

    //Jeito 3 (menos usado)
    //@GetMapping(value = "/generico")
    //public String generico(){
    //    return "generico";
    //}

    @GetMapping(value = "/password/new")
    public String altSenha(){
        return "alterarSenha";
    }
}
