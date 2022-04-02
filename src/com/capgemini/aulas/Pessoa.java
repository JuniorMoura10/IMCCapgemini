package com.capgemini.aulas;

public class Pessoa {

    //Atributos
    float peso;
    float altura;
    String nome;

    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
}
