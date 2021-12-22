package romanconverter.romanconverter.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping
public class ConverterController {

    @GetMapping(value = "/roman-to-int/{romanNumber}")
    public Integer converteRomanToInteger(@PathVariable  String romanNumber) {

        Map<Character, Integer> values = new LinkedHashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int number = 0;
        for (int i = 0; i < romanNumber.length(); i++) {
            if (i+1 == romanNumber.length() || values.get(romanNumber.charAt(i)) >= values.get(romanNumber.charAt(i + 1))) {
                number += values.get(romanNumber.charAt(i));
            } else {
                number -= values.get(romanNumber.charAt(i));
            }
        }
        return number;
    }
}
