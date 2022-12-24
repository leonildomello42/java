package cap14_interfaces.aula06_problemas_heranca_financeira.modelo;

public abstract class EmpresaFinanciavel extends Empresa {

    public EmpresaFinanciavel(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    public abstract double calcularLimiteAprovado();

}