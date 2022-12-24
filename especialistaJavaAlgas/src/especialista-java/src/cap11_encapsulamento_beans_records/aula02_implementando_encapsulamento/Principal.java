package cap11_encapsulamento_beans_records.aula02_implementando_encapsulamento;


import cap11_encapsulamento_beans_records.aula02_implementando_encapsulamento.servico.ServicoDeDepositoPix;
import cap11_encapsulamento_beans_records.aula02_implementando_encapsulamento.servico.ServicoDePagamentoOnline;

public class Principal {

    public static void main(String[] args) {
        var supermercado = new Estabelecimento("Supermercado do Zé");
        var cartao = new Cartao("João Souza Silva");

        var servicoDeDeposito = new ServicoDeDepositoPix();
        Recibo reciboDeposito = servicoDeDeposito.efetuarDeposito(cartao, 500);
        reciboDeposito.imprimir();

        var servicoDePagamento = new ServicoDePagamentoOnline();
        Recibo reciboPagamento = servicoDePagamento.efetuarPagamento(supermercado, cartao, 100);
        reciboPagamento.imprimir();

        System.out.printf("Titular: %s%n", cartao.obterTitular());
        System.out.printf("Saldo: R$%.2f%n", cartao.obterSaldo());
    }

}