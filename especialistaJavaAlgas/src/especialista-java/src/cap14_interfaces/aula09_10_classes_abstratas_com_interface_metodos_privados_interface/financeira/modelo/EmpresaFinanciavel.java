package cap14_interfaces.aula09_10_classes_abstratas_com_interface_metodos_privados_interface.financeira.modelo;

public abstract class EmpresaFinanciavel extends Empresa implements ClienteFinanciavel {

    public EmpresaFinanciavel(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    @Override
    public double calcularJuros(double valorSolicitado) {
        return 0.8;
    }

}