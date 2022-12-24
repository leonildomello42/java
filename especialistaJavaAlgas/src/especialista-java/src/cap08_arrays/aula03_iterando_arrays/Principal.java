package cap08_arrays.aula03_iterando_arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {

    public static void main(String[] args) {
        int[] notas = {8, 5, 4, 9, 10};

        double media = Calculadora.calcularMedia(notas);

        System.out.println(media);

        //ToString
        String notasString = Arrays.toString(notas);
        System.out.println(notasString);

        //Sort
        Integer[] notasInteger = {8, 5, 4, 9, 10};

        Arrays.sort(notasInteger);

        Arrays.sort(notasInteger, Comparator.reverseOrder());

        System.out.println(Arrays.toString(notasInteger));
    }

}