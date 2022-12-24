package cap05_mergulhando_oo.aula22_discutindo_nome_responsabilidade;

public class Principal {

    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
        calculadoraImc.altura = 1.82;
        calculadoraImc.peso = 175;

        IndiceMassaCorporal imc = calculadoraImc.calcular();

        if (imc.estaComObesidade()) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
                    "está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }

}
