/* Escopo do Projeto
*
*
*  Para doar sangue é necessário ter entre 18 e 69 anos de idade. Pessoas com idade
* entre 60 e 69 anos, só podem doar se não for a sua primeira doação. Escreva um
* Algoritmo em Java que obtenha via teclado o nome do doador (String), a idade (inteiro)
* do doador e se é a primeira doação (boolean). De acordo com as Regras para a
* doação, mostre na tela se o doador está Apto ou Não Apto para doar sangue. Veja os
* exemplos abaixo:
*
*
* Produzido por Jefferson Felix
* Programa Generation Java FullStack
* */


import java.util.Scanner;

public class DoadorApto {
    public static void main(String[] args){

        //Importando o Scanner para entrada do usuario
        Scanner sc = new Scanner(System.in);

        // Variaveis
        String nomeDoador;
        int idade;
        boolean doacao;

        System.out.println("Informe o nome do doador");
        nomeDoador = sc.nextLine();
        System.out.println("Informe a idade");
        idade = sc.nextInt();
        System.out.println("Primeira Doação?");
        doacao = sc.nextBoolean();

        // Laço Condicional IF
        if(idade >=18 && idade<60){
            System.out.println(nomeDoador+" está apto para doar sangue!");
        }
        else if(idade >=60 && idade<=69){
            if(!doacao){
                System.out.println(nomeDoador+" está apto para doar sangue!");
            }
            else if(doacao){
                System.out.println(nomeDoador+" não está apto para doar sangue!");
            }
        }
        else{
            System.out.println(nomeDoador+" não está apto para doar sangue!");

        }
    }
}
