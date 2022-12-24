package cap14_interfaces.aula07_refatoracao_interfaces_default_metods.modelo;

public class ParceiroFinanceiro extends Empresa {

    private double valorTotalAplicado;

    public ParceiroFinanceiro(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    public double getValorTotalAplicado() {
        return valorTotalAplicado;
    }

    public void adicionarNovaAplicacao(double valorAplicado) {
        valorTotalAplicado += valorAplicado;
    }

}