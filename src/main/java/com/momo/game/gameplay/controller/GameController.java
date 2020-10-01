package com.momo.game.gameplay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {

    @GetMapping(value="/")
    public String getIndex() {
        return "index";
    }
}
