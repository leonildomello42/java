package cap12_heranca.aula09_metodos_superclasse_super_object.banco;

public class ContaInvestimento extends Conta {

    private double valorTotalRendimentos;

    public double getValorTotalRendimentos() {
        return valorTotalRendimentos;
    }

    public void creditarRendimentos(double percentualJuros) {
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimentos += valorRendimentos;
        depositar(valorRendimentos);
    }

}