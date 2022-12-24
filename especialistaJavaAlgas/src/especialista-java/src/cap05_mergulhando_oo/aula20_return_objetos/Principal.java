package cap05_mergulhando_oo.aula20_return_objetos;

public class Principal {

    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.altura = 1.82;
        paciente.peso = 75;

        IndiceMassaCorporal imc = paciente.calcularIndiceMassaCorporal();

        if (imc.resultado >= 30) {
            System.out.printf("Paciente com altura de %.2f e peso de %.2f " +
                    "está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f%n", imc.resultado);
    }

}
