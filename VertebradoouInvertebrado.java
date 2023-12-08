import java.util.Objects;
import java.util.Scanner;

public class VertebradoouInvertebrado {
    public static void main(String[] args) {

        // Variaveis
        String escolha, escolha1, escolha2;


        // Metodo Scanner
        Scanner sc = new Scanner(System.in);


        //Painel de boas vindas
        System.out.println(" Olá Seja Bem Vindos \n " +
                "Escolha abaixo a Caracteristica inicial\n " +
                "1 - Vertebrado \n" +
                " 2 - Invertebrado \n" +
                "Digite Ex: Vertebrado ou Invertebrado:");

        // Painel de Escolha
        escolha = sc.nextLine().toLowerCase();

        if (escolha.equals("vertebrado")) {
            System.out.println("Escolha entre Ave ou Mamifero, Digite abaixo: ");
            escolha1 = sc.nextLine().toLowerCase();
            if (Objects.equals(escolha1, "ave")) {
                System.out.println("Escolha entre Carnivoro ou Onivoro, Digite abaixo: ");
                escolha2 = sc.nextLine().toLowerCase();
                if (Objects.equals(escolha2, "carnivoro")) {
                    System.out.println(" O tipo da sua Ave-carnivoro é Águia");
                } else if (Objects.equals(escolha2, "onivoro")) {
                    System.out.println(" O tipo da sua Ave-onivoro é Pomba");
                } else {
                    System.out.println("Error: Recomendamos recomeçar a aplicação! ");
                }
            } else if (Objects.equals(escolha1, "mamifero")) {
                System.out.println("Escolha entre Onivoro ou Herbivoro, Digite abaixo: ");
                escolha2 = sc.nextLine().toLowerCase();
                if (Objects.equals(escolha2, "onivoro")) {
                    System.out.println(" O tipo do seu Mamifero - Onivoro é Homem");
                } else if (Objects.equals(escolha2, "herbivoro")) {
                    System.out.println(" O tipo do seu Mamifero - herbivoro é Vaca");
                }
            }
        } else if (escolha.equals("invertebrado")) {
            System.out.println("Escolha entre Inseto ou Anelideo, Digite abaixo: ");
            escolha1 = sc.nextLine().toLowerCase();
            if (Objects.equals(escolha1, "inseto")) {
                System.out.println("Escolha entre hematofago ou herbivoro, Digite abaixo: ");
                escolha2 = sc.nextLine().toLowerCase();
                if (Objects.equals(escolha2, "hematofago")) {
                    System.out.println(" O tipo do seu Inseto - hematofago é Pulga");
                } else if (Objects.equals(escolha2, "herbivoro")) {
                    System.out.println(" O tipo do seu Inseto - herbivoro é Lagarta");
                } else {
                    System.out.println("Error: Recomendamos recomeçar a aplicação! ");
                }
            } else if (Objects.equals(escolha1, "anelideo")) {
                System.out.println("Escolha entre hematofago ou Anelídeo, Digite abaixo: ");
                escolha2 = sc.nextLine().toLowerCase();
                if (Objects.equals(escolha2, "hematofago")) {
                    System.out.println(" O tipo do seu Anelídeo - hematofago é Sanguessuga");
                } else if (Objects.equals(escolha2, "onivoro")) {
                    System.out.println(" O tipo do seu Anelídeo - onivoro é Minhoca");
                }
            }
        }else{System.out.println("Recomeçe a aplicação!");}
    }

}
