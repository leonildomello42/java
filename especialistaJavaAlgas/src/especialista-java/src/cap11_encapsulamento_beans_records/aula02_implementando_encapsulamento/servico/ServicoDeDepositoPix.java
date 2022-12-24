package cap11_encapsulamento_beans_records.aula02_implementando_encapsulamento.servico;


import cap11_encapsulamento_beans_records.aula02_implementando_encapsulamento.Cartao;
import cap11_encapsulamento_beans_records.aula02_implementando_encapsulamento.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobrança do valor no Pix

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.obterTitular(), "Depósito", valorDeposito);
    }

}