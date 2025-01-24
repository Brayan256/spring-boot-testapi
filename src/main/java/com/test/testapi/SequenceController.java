package com.test.testapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/secuence")
public class SequenceController {

    @PutMapping("/collatz/{input}")
    public ResponseEntity<List<Integer>> getCollatzSequence(@PathVariable("input") int input) {
    	return ResponseEntity.ok(collatzSequence(input));
    }

    private List<Integer> collatzSequence(int input) {
        List<Integer> sequence = new ArrayList<>();
        while (input != 1) {
            sequence.add(input);
            if (input % 2 == 0) {
                input /= 2;
            } else {
                input = 3 * input + 1;
            }
        }
        sequence.add(1);
        return sequence;
    }
    
    @PostMapping("/fizzbuzz/{input}")
    public ResponseEntity<List<String>> getFizzBuzzSequence(@PathVariable("input") int input) {
        return ResponseEntity.ok(fizzBuzzSequence(input));
    }
    
    private List<String> fizzBuzzSequence(int input) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= input; i++) {
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
        return result;
    }
}
