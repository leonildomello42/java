package cap05_mergulhando_oo.aula21_refatorando_classe;

public class Paciente {

    double peso;
    double altura;

    IndiceMassaCorporal calcularIndiceMassaCorporal() {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }

}
