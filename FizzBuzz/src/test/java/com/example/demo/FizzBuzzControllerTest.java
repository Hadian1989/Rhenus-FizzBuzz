package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzControllerTest {

    private final FizzBuzzController fizzBuzzController = new FizzBuzzController();

    @Test
    void getFizzBuzz_ReturnsFizzBuzzList() {
        int number = 15;

        ResponseEntity<List<String>> response = fizzBuzzController.getFizzBuzz(15);
        List<String> result = response.getBody();
        assertEquals(15, result.size());
        assertTrue(result.contains("FizzBuzz"));

        response = fizzBuzzController.getFizzBuzz(10);
        result = response.getBody();
        assertEquals(10, result.size());
        assertTrue(result.contains("Buzz"));

        // Test for edge cases
        response = fizzBuzzController.getFizzBuzz(1);
        result = response.getBody();
        assertEquals(1, result.size());
        assertTrue(result.contains("1"));
        assertFalse(result.contains("Fizz"));



    }
}