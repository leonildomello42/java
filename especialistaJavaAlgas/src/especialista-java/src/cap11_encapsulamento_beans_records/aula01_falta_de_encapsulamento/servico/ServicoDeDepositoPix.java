package cap11_encapsulamento_beans_records.aula01_falta_de_encapsulamento.servico;


import cap11_encapsulamento_beans_records.aula01_falta_de_encapsulamento.Cartao;
import cap11_encapsulamento_beans_records.aula01_falta_de_encapsulamento.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobrança do valor no Pix

        if (valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                    String.format("Valor de depósito não pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }

        cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;

        return new Recibo(cartao.titular, "Depósito", valorDeposito);
    }

}