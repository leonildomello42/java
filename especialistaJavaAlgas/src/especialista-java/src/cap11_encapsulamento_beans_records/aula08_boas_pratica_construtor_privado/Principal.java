package cap11_encapsulamento_beans_records.aula08_boas_pratica_construtor_privado;

import cap11_encapsulamento_beans_records.aula08_boas_pratica_construtor_privado.matematica.CalculadoraArea;

public class Principal {

    public static void main(String[] args) {
        double areaQuadrado = CalculadoraArea.calcularAreaQuadrado(5.2);
        double areaCirculo = CalculadoraArea.calcularAreaCirculo(10.5);

        System.out.printf("PI: %.2f%n", CalculadoraArea.PI);
        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);
    }

}