package cap05_estrutura_controle.aula35_if_else;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Que horas são: ");
        int hora = input.nextInt();

        if (hora < 12 ) {
            System.out.println("Bom dia!");
        }
        else if (hora < 18) {
            System.out.println("Bom tarde!");
        }
        else {
            System.out.println("Boa noite!");
        }
        input.close();
    }
}
