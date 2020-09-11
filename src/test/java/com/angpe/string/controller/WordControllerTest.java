package com.angpe.string.controller;

import com.angpe.string.services.WordService;
import org.junit.jupiter.api.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest(WordController.class)
class WordControllerTest {

    @Autowired
    private MockMvc mvc;

//    @MockBean
//    WordService ws;

    @Test
    void mask() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/mask?word=kucing"))
                .andExpect(content().string("k****g"));
    }
}