package com.angpe.string.controller;


import com.angpe.string.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mask")
public class WordController {


    @GetMapping("")
    public String Mask(@RequestParam(name="word", defaultValue = "word") String word){
        return WordService.mask(word);
    }

}
