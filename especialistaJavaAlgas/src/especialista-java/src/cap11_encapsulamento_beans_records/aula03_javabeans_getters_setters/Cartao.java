package cap11_encapsulamento_beans_records.aula03_javabeans_getters_setters;

import java.io.Serial;
import java.io.Serializable;

public class Cartao implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    private String titular;
    private double saldo;
    private boolean ativo;

    public Cartao() {
    }

    public Cartao(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void debitar(double valorDebito) {
        if (getSaldo() < valorDebito) {
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        saldo -= valorDebito;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito < VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                    String.format("Valor de depósito não pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }

        saldo += valorDeposito - TARIFA_DEPOSITO;
    }

}