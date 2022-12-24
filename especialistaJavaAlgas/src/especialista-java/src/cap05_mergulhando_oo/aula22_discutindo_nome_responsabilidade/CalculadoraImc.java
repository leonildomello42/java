package cap05_mergulhando_oo.aula22_discutindo_nome_responsabilidade;

public class CalculadoraImc {

    double peso;
    double altura;

    IndiceMassaCorporal calcular() {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }

}
