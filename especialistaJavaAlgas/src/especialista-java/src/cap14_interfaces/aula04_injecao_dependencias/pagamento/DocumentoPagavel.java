package cap14_interfaces.aula04_injecao_dependencias.pagamento;

public interface DocumentoPagavel {

    public abstract double getValorTotal();

    Beneficiario getBeneficiario();

}