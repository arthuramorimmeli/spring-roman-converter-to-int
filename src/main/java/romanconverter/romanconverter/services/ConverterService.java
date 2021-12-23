package romanconverter.romanconverter.services;

import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class ConverterService {


    public String convertIntToRoman(Integer integerNumber) {
        int[] roman_value_list = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] roman_char_list = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();


        for (int i = 0; i < roman_value_list.length; i += 1) {
            while (integerNumber >= roman_value_list[i]){
                integerNumber -= roman_value_list[i];
                res.append(roman_char_list[i]);
            }
        }

        return res.toString();
    }

    public int convertRomanToInt(String romanNumber) {
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
