package romanconverter.romanconverter.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import romanconverter.romanconverter.services.ConverterService;

@RestController
@RequestMapping
public class ConverterController {

    @Autowired
    private ConverterService converterService;

    @GetMapping(value = "")
    public String returnMessageEndpoint() {
        return "Para realziar a conversão utilize o endpoint /roman-to-int/{romanNumber}";
    }

    @GetMapping(value = "/roman-to-int/{romanNumber}")
    public Integer converteRomanToInteger(@PathVariable  String romanNumber) {
        return converterService.convertRomanToInt(romanNumber);
    }




    @GetMapping(value = "/int-to-roman/{integerNumber}")
    public String converteToDecimalToRoman(@PathVariable Integer integerNumber) {

        return converterService.convertIntToRoman(integerNumber);
    }


}
