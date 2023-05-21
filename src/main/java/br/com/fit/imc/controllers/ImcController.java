package br.com.fit.imc.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fit.imc.models.Person;
import br.com.fit.imc.services.ImcCalculatorService;

@RestController
@RequestMapping("/imc")
public class ImcController {
    
    @PostMapping("/calculate")
    public Person calculateImc(@RequestBody Person person) {
        var imcSvc = new ImcCalculatorService();
        imcSvc.calculate(person);

        return person;
    }
}
