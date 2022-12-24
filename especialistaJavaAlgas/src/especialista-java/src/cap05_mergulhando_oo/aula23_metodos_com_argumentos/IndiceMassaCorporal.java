package cap05_mergulhando_oo.aula23_metodos_com_argumentos;

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
