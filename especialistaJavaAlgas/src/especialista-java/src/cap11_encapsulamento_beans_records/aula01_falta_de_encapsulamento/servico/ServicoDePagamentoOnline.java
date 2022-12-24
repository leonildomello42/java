package cap11_encapsulamento_beans_records.aula01_falta_de_encapsulamento.servico;


import cap11_encapsulamento_beans_records.aula01_falta_de_encapsulamento.Cartao;
import cap11_encapsulamento_beans_records.aula01_falta_de_encapsulamento.Estabelecimento;
import cap11_encapsulamento_beans_records.aula01_falta_de_encapsulamento.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valor) {
        if (cartao.saldo < valor) {
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        cartao.saldo -= valor;

        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.titular, "Pagamento", valor);
    }

}