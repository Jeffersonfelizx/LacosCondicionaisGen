import java.util.Scanner;

public class CodigoDeItem {

    public static void main(String[] args) {

        //Variaveis
        int entrada,quantoDesejaComprar;
        double total,valor,produtoCachorroQuente,xSalada,xBacon,bauru,refrigerante,sucoDeLaranja;
        int quantidade = 0;

        //Import da entrada usuario
        Scanner sc = new Scanner(System.in);
            System.out.println("Seja bem vindos a GenerationFood " +
                    "\n 1 - Cachorro Quente - R$10,00" +
                    "\n 2 - X-Salada        - R$15,00 " +
                    "\n 3 - X-Bacon         - R$18,00" +
                    "\n 4 - Bauru           - R$12,00" +
                    "\n 5 - Refrigerante    - R$ 8,00" +
                    "\n 6 - Suco de laranja - R$ 13,00" +
                    "\n Informe o numero da Opçao que queira");
            entrada = sc.nextInt();

            switch (entrada){
                case 1:
                    System.out.println("Quantos deseja comprar? ");
                    quantoDesejaComprar = sc.nextInt();
                    System.out.println("Adicionado: " +quantoDesejaComprar+ " Cachorro quente a sua compra");
                    produtoCachorroQuente = 10.00;
                    total = produtoCachorroQuente * quantoDesejaComprar;
                    System.out.printf("Valor Total: %.2f",total);
                    System.out.println(" Quantidade comprada: "+quantidade);
                    break;
                case 2:
                    System.out.println("Quantos deseja comprar? ");
                    quantoDesejaComprar = sc.nextInt();
                    System.out.println("Adicionado: " +quantoDesejaComprar+ " X-Salada a sua compra");
                    xSalada = 15.00;
                    total = xSalada * quantoDesejaComprar;
                    System.out.printf("Valor Total: %.2f",total);
                    System.out.println(" Quantidade comprada: "+quantidade);
                case 3:
                    System.out.println("Quantos deseja comprar? ");
                    quantoDesejaComprar = sc.nextInt();
                    System.out.println("Adicionado: " +quantoDesejaComprar+ " X-Bacon a sua compra");
                    xBacon = 18.00;
                    total = xBacon * quantoDesejaComprar;
                    System.out.printf("Valor Total: %.2f",total);
                    System.out.println(" Quantidade comprada: "+quantidade);
                case 4:
                    System.out.println("Quantos deseja comprar? ");
                    quantoDesejaComprar = sc.nextInt();
                    System.out.println("Adicionado: " +quantoDesejaComprar+ " X-Bauru a sua compra");
                    bauru = 12.00;
                    total = bauru * quantoDesejaComprar;
                    System.out.printf("Valor Total: %.2f",total);
                    System.out.println(" Quantidade comprada: "+quantidade);
                case 5:
                    System.out.println("Quantos deseja comprar? ");
                    quantoDesejaComprar = sc.nextInt();
                    System.out.println("Adicionado: " +quantoDesejaComprar+ " Refrigerante a sua compra");
                    refrigerante = 8.00;
                    total = refrigerante * quantoDesejaComprar;
                    System.out.printf("Valor Total: %.2f",total);
                    System.out.println(" Quantidade comprada: "+quantidade);
                case 6:
                    System.out.println("Quantos deseja comprar? ");
                    quantoDesejaComprar = sc.nextInt();
                    System.out.println("Adicionado: " +quantoDesejaComprar+ " Suco de Laranja a sua compra");
                    sucoDeLaranja = 13.00;
                    total = sucoDeLaranja * quantoDesejaComprar;
                    System.out.printf("Valor Total: %.2f",total);
                    System.out.println(" Quantidade comprada: "+quantidade);
            }

    }
}