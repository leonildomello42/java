package cap05_mergulhando_oo.aula22_discutindo_nome_responsabilidade;

public class IndiceMassaCorporal {

    double resultado;
    double peso;
    double altura;

    boolean estaComObesidade() {
        return resultado >= 30;
    }

    boolean estaAbaixoDoPesoIdeal() {
        return resultado < 18.5;
    }

}
