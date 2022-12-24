package cap11_encapsulamento_beans_records.aula08_boas_pratica_construtor_privado.matematica;

public class CalculadoraArea {

    public static final double PI = 3.14159265358979323846;

    private CalculadoraArea() {
    }

    public static double calcularAreaQuadrado(double medidaDoLado) {
        return medidaDoLado * medidaDoLado;
    }

    public static double calcularAreaCirculo(double raio) {
        return raio * raio * CalculadoraArea.PI;
    }

}