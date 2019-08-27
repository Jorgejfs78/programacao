package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int idade;
        String nome;
        System.out.println("informe seu nome");
        Scanner sc = new Scanner(System.in);
        nome = sc.nextLine();
        System.out.println("informe seu idade");
        idade = sc.nextInt();
        System.out.println("seu nome é " + nome + " e sua idade é " + idade);

	// write your code here
    }
}
