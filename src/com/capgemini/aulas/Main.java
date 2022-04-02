package com.capgemini.aulas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o seu nome? ");
        pessoa1.nome = leitor.next();

        System.out.println(pessoa1.nome + ", digite o seu peso: ");
        pessoa1.peso = leitor.nextFloat();

        System.out.println("Agora, digite a sua altura: ");
        pessoa1.altura = leitor.nextFloat();

        System.out.println("O seu IMC é: " + pessoa1.calcularIMC());
    }
}
