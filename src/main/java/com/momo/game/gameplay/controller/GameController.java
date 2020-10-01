package com.momo.game.gameplay.controller;

import com.momo.game.gameplay.model.UserEntity;
import com.momo.game.gameplay.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class GameController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getIndex(@ModelAttribute("user") UserEntity userEntity) {
        return "star_game";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String playGame(@Valid @ModelAttribute UserEntity userEntity, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "star_game";
        }
        userRepository.save(userEntity);
        return "game_room";
    }

    @RequestMapping(value = "/submit")
    public void submit() {
    }

}
