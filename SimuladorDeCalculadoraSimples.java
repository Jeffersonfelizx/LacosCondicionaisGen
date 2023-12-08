/*
Com base na tabela abaixo, escreva um algoritmo em Java, que simule uma
Calculadora simples. O programa deverá ler dois números float: numero1 e numero2,
e na sequência ler o Código da operação matemática (número inteiro de 1 a 4). A
seguir, mostre na tela o resultado da operação entre os 2 números. Caso a operação
seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!
*/

import java.util.Scanner;

public class SimuladorDeCalculadoraSimples {

    public static void main(String[] args) {

        //Variaveis
        float numero1, numero2, resultado;
        int escolhaOperacao;

        //Imports de entrada
        Scanner sc = new Scanner(System.in);


        System.out.println("Escolha a operação que deseja efetuar: " +
                "\n1 - Soma " +
                "\n2 - Subtração" +
                "\n3 - Multiplicação" +
                "\n4 - Divisão");

        escolhaOperacao = sc.nextInt();


        switch(escolhaOperacao) {
            case 1:
                System.out.println("Entre com o primeiro numero: ");
                numero1 = sc.nextFloat();
                System.out.println("Entre com o Segundo Numero: ");
                numero2 = sc.nextFloat();
                resultado = numero1 + numero2;
                System.out.println("Os numeros somados: "+numero1+" + "+numero2+" Resultam em: " +resultado);
                break;
            case 2:
                System.out.println("Entre com o primeiro numero: ");
                numero1 = sc.nextFloat();
                System.out.println("Entre com o Segundo Numero: ");
                numero2 = sc.nextFloat();
                resultado = numero1 - numero2;
                System.out.println("Os numeros Subtraidos: "+numero1+" - "+numero2+" Resultam em: " +resultado);
                break;
            case 3:
                System.out.println("Entre com o primeiro numero: ");
                numero1 = sc.nextFloat();
                System.out.println("Entre com o Segundo Numero: ");
                numero2 = sc.nextFloat();
                resultado = numero1 * numero2;
                System.out.println("Os numeros Multiplicados: "+numero1+" * "+numero2+" Resultam em: " +resultado);
                break;
            case 4:
                System.out.println("Entre com o primeiro numero: ");
                numero1 = sc.nextFloat();
                System.out.println("Entre com o Segundo Numero: ");
                numero2 = sc.nextFloat();
                resultado = numero1 - numero2;
                System.out.println("Os numeros Divididos: "+numero1+" / "+numero2+" Resultam em: " +resultado);
                break;
            default: System.out.println("Opção invalida");
        }

    }
}
