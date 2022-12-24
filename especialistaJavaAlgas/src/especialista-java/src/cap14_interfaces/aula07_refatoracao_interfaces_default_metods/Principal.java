package cap14_interfaces.aula07_refatoracao_interfaces_default_metods;


import cap14_interfaces.aula07_refatoracao_interfaces_default_metods.modelo.Fazenda;
import cap14_interfaces.aula07_refatoracao_interfaces_default_metods.modelo.Funcionario;
import cap14_interfaces.aula07_refatoracao_interfaces_default_metods.modelo.Industria;
import cap14_interfaces.aula07_refatoracao_interfaces_default_metods.modelo.ParceiroFinanceiro;
import cap14_interfaces.aula07_refatoracao_interfaces_default_metods.servico.ServicoFinanciamento;

public class Principal {

    public static void main(String[] args) {
        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 900_000, true);
        var parceiro = new ParceiroFinanceiro("Capital ABC", 2_000_000);
        var funcionario = new Funcionario("João da Silva", 18_000);

        servicoFinanciamento.solicitarFinanciamento(funcionario, 90_000);
        servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
        servicoFinanciamento.solicitarFinanciamento(industria, 500_000);
    }

}