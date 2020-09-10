package com.angpe.string.controller;


import com.angpe.string.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("word")
public class WordController {

    @Autowired
    private WordService ws;

    @GetMapping("/{word}")
    public String Mask(@PathVariable String word){
        return ws.mask(word);
    }

    @GetMapping("")
    public String MaskTwo(@RequestParam(value = "word",
            defaultValue = "Word", required = true)
                                      String word, Model model){
        model.addAttribute("word", word);
        return "Home.jsp";
    }
}
