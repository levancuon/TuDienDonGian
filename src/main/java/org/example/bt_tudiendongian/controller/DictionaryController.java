package org.example.bt_tudiendongian.controller;

import org.example.bt_tudiendongian.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {
    @Autowired
    DictionaryService dictionaryService;
    @GetMapping("")
    public String home(){
        return "/index";
    }

    @PostMapping("/search")
    public String search(Model model, @RequestParam String word){
        model.addAttribute("mean" ,dictionaryService.search(word)) ;
        return "/index";
    }

}
