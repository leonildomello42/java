package cap14_interfaces.aula04_injecao_dependencias;

import cap14_interfaces.aula04_injecao_dependencias.contaspagar.modelo.Holerite;
import cap14_interfaces.aula04_injecao_dependencias.contaspagar.modelo.OrdemServico;
import cap14_interfaces.aula04_injecao_dependencias.contaspagar.servico.ServicoContaPagar;
import cap14_interfaces.aula04_injecao_dependencias.pagamento.Beneficiario;
import cap14_interfaces.aula04_injecao_dependencias.pagamento.MetodoPagamento;
import cap14_interfaces.aula04_injecao_dependencias.pagamento.Transferencia;

public class Principal {

    public static void main(String[] args) {
        MetodoPagamento metodoPagamento = new Transferencia();
        ServicoContaPagar servicoContaPagar = new ServicoContaPagar(metodoPagamento);

        Beneficiario funcionario = new Beneficiario("João da Silva", "34999998888", "456789");
        Holerite holerite = new Holerite(funcionario, 100, 168);

        Beneficiario fornecedor = new Beneficiario("Consultoria XYZ", "10687799000187", "34466");
        OrdemServico os = new OrdemServico(fornecedor, 65_500);

        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(os);
    }

}