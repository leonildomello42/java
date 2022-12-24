package cap06_introducao_clean_code.aula04_comentarios_no_codigo;

public class Contribuinte {

    // Conforme Lei XYZ
    static final int IDADE_MINIMA_APOSENTADORIA = 65;

    int idade;
    int tempoContribuicaoEmAnos;

    boolean estaElegivelParaAposentadoria() {
        return idade >= IDADE_MINIMA_APOSENTADORIA;
    }

}