package cap11_encapsulamento_beans_records.aula03_javabeans_getters_setters.servico;


import cap11_encapsulamento_beans_records.aula03_javabeans_getters_setters.Cartao;
import cap11_encapsulamento_beans_records.aula03_javabeans_getters_setters.Estabelecimento;
import cap11_encapsulamento_beans_records.aula03_javabeans_getters_setters.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valor) {
        cartao.debitar(valor);

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }

}