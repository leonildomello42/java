package cap10_memo_array_listas.aula90_vetor_classe.application;

import cap10_memo_array_listas.aula90_vetor_classe.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] vect = new Product[3];

        vect[0] = new Product("TV", 15.50);


        sc.close();
    }
}
