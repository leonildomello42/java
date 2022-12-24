package cap04_estrutura_sequencial.aula26_entrada_dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x_string;
        x_string = sc.next();
        System.out.println("Você digitou: " + x_string);

        System.out.println("----------------------");

        int x_int;
        x_int = sc.nextInt();
        System.out.println("Você digitou: " + x_int);

        System.out.println("----------------------");

        double x_double;
        x_double = sc.nextDouble();
        System.out.println("Você digitou: " + x_double);

        System.out.println("----------------------");

        char x_char;
        x_char = sc.next().charAt(0);
        System.out.println("Você digitou: " + x_char);


        sc.close();
    }
}
