package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("")

public class FizzBuzzController {

@GetMapping("/fizzbuzz")
    public String showFizzBuzzForm() {
    return "fizzbuzz";
}

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




