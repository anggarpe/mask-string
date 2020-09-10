package com.angpe.string;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;

import com.angpe.string.services.WordService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;


class MaskTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testGivenString_ThenReturnStringWithMask() {
        HashMap<String, String> tests = new HashMap<>();

        tests.put("Tony Stark", "T**y S***k");
        tests.put("Peter Parker", "P***r P****r");
        tests.put("Bumblebee", "B*******e");
        tests.put("El Torino", "El T****o");
        tests.put("John Doe", "J**n D*e");
        tests.put("Crazy Rich Asian", "C***y R**h A***n");
        tests.put("Stephen Strange", "S*****n S*****e");
        tests.put("A Kid With Supernatural Abilities", "A K*d W**h S**********l A*******s");
        tests.put("AB", "AB");
        tests.put("cd", "cd");

        tests.forEach((original, masked) -> assertEquals(masked, WordService.mask(original)));
    }

    @Test
    void testReturnWithSpace_WhenLastElementNotEquals(){
        HashMap<String, String> tests = new HashMap<>();

        tests.put("pig", "cow");
        tests.put("bird", "man");

        tests.forEach((one, two) -> assertEquals(" ", WordService.space(one, two)));
    }
}

