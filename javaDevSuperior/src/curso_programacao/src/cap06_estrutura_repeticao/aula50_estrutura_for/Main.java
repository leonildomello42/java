package cap06_estrutura_repeticao.aula50_estrutura_for;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int N = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println(soma);

        sc.close();
    }
}

