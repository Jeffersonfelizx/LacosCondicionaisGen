/* Escopo do Projeto
*
* Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a
soma de A + B é maior, menor ou igual a C
*
* Produzido por Jefferson Felix
* Programa Generation Java Fullstack
* */

import java.util.Scanner;

public class SomaAB {
    public static void main(String[] args){

        // Scanner para Entrada de Usuario
        Scanner sc = new Scanner(System.in);

        //
        int a,b,c,soma;

        System.out.println("\n Digite o Número A: ");
        a = sc.nextInt();
        System.out.println("\n Digite o Número B: ");
        b = sc.nextInt();
        System.out.println("\n Digite o Número C: ");
        c = sc.nextInt();

        soma = a+b;
        if (soma > c) {
            System.out.println("A Soma de A + B é Maior do que C");
            System.out.println(a+"+"+b+"="+soma+">"+c);
        } else if(soma < c){
            System.out.println("A Soma de A + B é Menor do que C");
            System.out.println(a+"+"+b+"="+soma+"<"+c);
        } else{
            System.out.println("A Soma de A + B é Igual a C");
            System.out.println(a+"+"+b+"="+soma+"="+c);
        }
    }
}
