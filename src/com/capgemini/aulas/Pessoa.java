package com.capgemini.aulas;

public class Pessoa {

    //Atributos
    private float peso;
    private float altura;
    private String nome;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
}
