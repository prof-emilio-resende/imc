package br.com.fit.imc.services;

import br.com.fit.imc.models.Person;

public class ImcCalculatorService {
    public ImcCalculatorService() {
        super();
    }

    public void calculate(Person person) {
        person.setImc(person.getWeight() / Math.pow(person.getHeight(), 2));
        person.setImcDescription("Obesidade");
        if (person.getImc() < 18.5) person.setImcDescription("Magreza");
        if (person.getImc() < 24.9) person.setImcDescription("Normal");
        if (person.getImc() < 30) person.setImcDescription("Sobrepeso");
    }
}
