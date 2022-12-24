package cap05_mergulhando_oo.aula36_constantes_sobrescrita;

public class CadastroPortaria {

    void cadastrar(final Visitante visitante, final int tempoExpiracaoEmMeses) {
        final int tempoExpiracaoEmDias = tempoExpiracaoEmMeses * 30;

        System.out.printf("Visitante %s cadastrado para %d dias%n",
                visitante.nome, tempoExpiracaoEmDias);
    }

}