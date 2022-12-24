package cap10_construtores_pacotes_visibilidade.aula10_import_estatico.principal;


import static cap10_construtores_pacotes_visibilidade.aula10_import_estatico.matematica.CalculadoraArea.*;

public class Principal {

    public static void main(String[] args) {
        double areaQuadrado = calcularAreaQuadrado(5.2);
        double areaCirculo = calcularAreaCirculo(10.5);

        System.out.printf("PI: %.2f%n", PI);
        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);
    }

}