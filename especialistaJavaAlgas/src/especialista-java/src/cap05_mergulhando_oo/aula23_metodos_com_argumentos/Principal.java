package cap05_mergulhando_oo.aula23_metodos_com_argumentos;

public class Principal {

    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
        double altura = 1.82;
        double peso = 175;

        IndiceMassaCorporal imc = calculadoraImc.calcular(peso, altura);

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
                    "está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }

}
