package cap15_tratamento_excecoes.aula170_try_catch_finally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position");
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Input error");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
        finally {
            System.out.println("Final da execução");
            sc.close();
        }

    }
}
