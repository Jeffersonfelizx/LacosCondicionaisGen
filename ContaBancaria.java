import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        //variaveis
        int operacao;
        float saldo = 1000F, novoSaldo,deposito,saque;



        //import para entrada de usuario
        Scanner sc = new Scanner(System.in);


        System.out.println("Código da Operação" +
                "       \n 1 - Saldo" +
                "       \n 2 - Saque" +
                "       \n 3 - Depósito");

        operacao = sc.nextInt();
        switch (operacao){
            case 1: System.out.println("Saldo Atual: "+saldo);
            break;
            case 2:
                System.out.println("Insira o valor de saque: ");
                saque = sc.nextFloat();
                if (saque > saldo){
                    System.out.println("Saldo insuficiente!");
                } else if(saque <= saldo){
                    novoSaldo = saldo - saque;
                    System.out.println("O saque de "+saque+" foi efetuado com sucesso! seu novo saldo é "+novoSaldo);
                }
                break;
            case 3:
                System.out.println("Insira o valor de deposito: ");
                deposito = sc.nextFloat();
                novoSaldo = saldo + deposito;
                System.out.println("O deposito de "+deposito+" foi efetuado com sucesso! seu novo saldo é "+novoSaldo);
                break;
            default: System.out.println("Operação Invalida!");
        }
    }
}
