package cap11_encapsulamento_beans_records.aula02_implementando_encapsulamento.servico;


import cap11_encapsulamento_beans_records.aula02_implementando_encapsulamento.Cartao;
import cap11_encapsulamento_beans_records.aula02_implementando_encapsulamento.Estabelecimento;
import cap11_encapsulamento_beans_records.aula02_implementando_encapsulamento.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valor) {
        cartao.debitar(valor);

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.obterTitular(), "Pagamento", valor);
    }

}