package cap05_mergulhando_oo.aula24_objetos_como_argumentos;

public class CalculadoraImc {

    IndiceMassaCorporal calcular(Paciente paciente) {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = paciente.peso / (paciente.altura * paciente.altura);
        imc.peso = paciente.peso;
        imc.altura = paciente.altura;

        return imc;
    }

}