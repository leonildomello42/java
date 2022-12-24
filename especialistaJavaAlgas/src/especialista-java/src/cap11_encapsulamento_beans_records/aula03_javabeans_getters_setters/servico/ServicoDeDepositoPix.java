package cap11_encapsulamento_beans_records.aula03_javabeans_getters_setters.servico;


import cap11_encapsulamento_beans_records.aula03_javabeans_getters_setters.Cartao;
import cap11_encapsulamento_beans_records.aula03_javabeans_getters_setters.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobrança do valor no Pix

        cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Depósito", valorDeposito);
    }

}