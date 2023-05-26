package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The FizzBuzzControllerTest class.
 * It is responsible for testing the FizzBuzzController class.
 */
class FizzBuzzControllerTest {

    private final FizzBuzzController fizzBuzzController = new FizzBuzzController();

    /**
     * Test case to verify the generation of FizzBuzz list for a given number.
     */
    @Test
    void getFizzBuzz_ReturnsFizzBuzzList() {
        int number = 15;
        // Test case for number = 15

        ResponseEntity<List<String>> response = fizzBuzzController.getFizzBuzz(15);
        List<String> result = response.getBody();
        // Asserting the size of the result list

        assertEquals(15, result.size());
        // Asserting the presence of "FizzBuzz" in the result list

        assertTrue(result.contains("FizzBuzz"));


        // Test case for number = 1 (edge case)
        response = fizzBuzzController.getFizzBuzz(1);
        result = response.getBody();

        // Asserting the size of the result list
        assertEquals(1, result.size());

        // Asserting the presence of "1" in the result list
        assertTrue(result.contains("1"));

        // Asserting the size of the result list
        assertFalse(result.contains("Fizz"));


    }
}