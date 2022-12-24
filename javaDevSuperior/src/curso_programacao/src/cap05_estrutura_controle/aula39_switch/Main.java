package cap05_estrutura_controle.aula39_switch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        String dia;

        switch (x) {

            case 0:
            case 1:
                dia = "domingo";
                break;

            case 2:
                dia = "segunda";
                break;

            case 3:
                dia = "terça";
                break;

            case 4:
                dia = "quarta";
                break;

            case 5:
                dia = "quinta";
                break;

            case 6:
                dia = "sexta";
                break;

            case 7:
                dia = "sabado";
                break;

            default:
                dia = "valor inválido!";
                break;
        }

        System.out.println("Dia da semana: " + dia);
        input.close();
    }
}
