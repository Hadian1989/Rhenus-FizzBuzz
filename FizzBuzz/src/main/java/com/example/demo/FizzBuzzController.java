package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Controller class that handles FizzBuzz requests and provides FizzBuzz responses.
 * Handles GET requests for FizzBuzz generation.
 */
@Controller
@RequestMapping("")

public class FizzBuzzController {
    /**
     * Handles the GET request for the "/fizzbuzz" endpoint and returns the FizzBuzz form view.
     *
     * @return The view name for the FizzBuzz form.
     */
    @GetMapping("/fizzbuzz")
    public String showFizzBuzzForm() {
        return "fizzbuzz";
    }

    /**
     * Handles the GET request for the "/fizzbuzz/{number}" endpoint and generates the FizzBuzz list.
     *
     * @param number The input number for FizzBuzz generation.
     * @return The ResponseEntity containing the FizzBuzz list as a response body.
     */
    @GetMapping("/fizzbuzz/{number}")

    public ResponseEntity<List<String>> getFizzBuzz(@PathVariable int number) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return ResponseEntity.ok(result);
    }
}




