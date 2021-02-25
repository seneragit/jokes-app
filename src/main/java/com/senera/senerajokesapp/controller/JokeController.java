package com.senera.senerajokesapp.controller;

import com.senera.senerajokesapp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Senera Madushan
 * @comment
 */
@Controller
public class JokeController {

    @Autowired
    private JokeService jokeService;

    @RequestMapping({"/",""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }


}
