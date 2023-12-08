/* Escopo do Projeto
*
*
* Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela
* uma mensagem indicando se este número é par ou ímpar e se o número é positivo ou
* negativo. Veja os exemplos abaixo:
*
*
* Na construção do Algoritmo, utilize os seguintes conteúdos:
● Entrada e Saída de dados
● Operadores
● Laço Condicional IF
*
* Produzido por Jefferson Felix
* Programa Generation Java FullStack
* */


import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args){

        // Importando o Scanner para entrada de usuario
        Scanner sc = new Scanner(System.in);

        // Variaveis
        System.out.println("Digite um numero para verificar se é impar ou par");
        int numero = sc.nextInt();

        if(numero%2 ==0 && numero >=0){
            System.out.println("\n O Número"+numero+" é par e positivo!");

        }else if(numero%2 !=0 && numero >=0) {
            System.out.println("\n O Número"+numero+" é impar e positivo!");

        }else if(numero%2 ==0 && numero <0){
            System.out.println("\n O Número"+numero+" é par e negativo!");
        }
        else{
            System.out.println("\n O Número"+numero+" é impar e negativo!");
        }
    }
}
//