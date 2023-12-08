import java.util.Scanner;

public class NomeColaborador {

    public static void main(String[] args) {

        //Variaveis
        String nomeColaborador;
        float salario,novoSalario,reajuste;
        int cargoColaborador;

        //Import Entrada usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        nomeColaborador = sc.nextLine();
        System.out.println("\n Codigo do Cargo - Cargo" +
                "\n 1 - Gerente" +
                "\n 2 - Vendedor" +
                "\n 3 - Supervisor" +
                "\n 4 - Motorista" +
                "\n 5 - Estoquista" +
                "\n 6 - Técnico de TI");
        System.out.println("Insira o Codigo do Cargo do Colaborador:");
        cargoColaborador = sc.nextInt();
        switch(cargoColaborador){
            case 1:
                System.out.println("Insira seu salario atual:");
                salario = sc.nextFloat();
                reajuste = (salario * 0.10f)/salario;
                novoSalario = salario+(reajuste*salario);
                System.out.println("O seu cargo "+nomeColaborador+" é Gerente ");
                System.out.println("seu novo Salario Foi reajustado em 10% ficando o valor de "+novoSalario);
            case 2:
                System.out.println("Insira seu salario atual:");
                salario = sc.nextFloat();
                reajuste = (salario * 0.07f)/salario;
                novoSalario = salario+(reajuste*salario);
                System.out.println("O seu cargo "+nomeColaborador+" é Vendedor ");
                System.out.println("seu novo Salario Foi reajustado em 7% ficando o valor de "+novoSalario);
            case 3:
                System.out.println("Insira seu salario atual:");
                salario = sc.nextFloat();
                reajuste = (salario * 0.09f)/salario;
                novoSalario = salario+(reajuste*salario);
                System.out.println("O seu cargo "+nomeColaborador+" é Supervisor ");
                System.out.println("seu novo Salario Foi reajustado em 9% ficando o valor de "+novoSalario);
            case 4:
                System.out.println("Insira seu salario atual:");
                salario = sc.nextFloat();
                reajuste = (salario * 0.06f)/salario;
                novoSalario = salario+(reajuste*salario);
                System.out.println("O seu cargo "+nomeColaborador+" é Motorista ");
                System.out.println("seu novo Salario Foi reajustado em 6% ficando o valor de "+novoSalario);
            case 5:
                System.out.println("Insira seu salario atual:");
                salario = sc.nextFloat();
                reajuste = (salario * 0.05f)/salario;
                novoSalario = salario+(reajuste*salario);
                System.out.println("O seu cargo "+nomeColaborador+" é Estoquista ");
                System.out.println("seu novo Salario Foi reajustado em 5% ficando o valor de "+novoSalario);
            case 6:
                System.out.println("Insira seu salario atual:");
                salario = sc.nextFloat();
                reajuste = (salario * 0.08f)/salario;
                novoSalario = salario+(reajuste*salario);
                System.out.println("O seu cargo "+nomeColaborador+" é Técnico de TI ");
                System.out.println("seu novo Salario Foi reajustado em 8% ficando o valor de "+novoSalario);
            default: System.out.println("Não foi possivel calcula, Tente novamente!");
        }
    }
}
