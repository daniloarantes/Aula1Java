/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula1java;

import java.util.Scanner;

/**
 *
 * @author danilo
 */
public class Principal {

    /* Este é o método main e precisa existir dentro
       da classe principal do projeto. */
    public static void main(String[] args) {
        String nome; // Criação de variável
        int idade;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("Digite sua Idade: ");
        idade = ler.nextInt();

        // Equivalente ao Escreva do visualG
        System.out.println("Olá Mundo! " + nome
                + " você tem " + idade + " anos");

    }

}
