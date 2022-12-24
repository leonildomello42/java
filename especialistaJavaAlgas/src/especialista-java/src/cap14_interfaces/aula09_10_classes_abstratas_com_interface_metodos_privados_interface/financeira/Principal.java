package cap14_interfaces.aula09_10_classes_abstratas_com_interface_metodos_privados_interface.financeira;

import cap14_interfaces.aula09_10_classes_abstratas_com_interface_metodos_privados_interface.financeira.modelo.Fazenda;
import cap14_interfaces.aula09_10_classes_abstratas_com_interface_metodos_privados_interface.financeira.modelo.Funcionario;
import cap14_interfaces.aula09_10_classes_abstratas_com_interface_metodos_privados_interface.financeira.modelo.Industria;
import cap14_interfaces.aula09_10_classes_abstratas_com_interface_metodos_privados_interface.financeira.modelo.ParceiroFinanceiro;
import cap14_interfaces.aula09_10_classes_abstratas_com_interface_metodos_privados_interface.financeira.servico.ServicoFinanciamento;

public class Principal {

    public static void main(String[] args) {
        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 900_000, true);
        var parceiro = new ParceiroFinanceiro("Capital ABC", 2_000_000);
        var funcionario = new Funcionario("João da Silva", 18_000);

        servicoFinanciamento.solicitarFinanciamento(funcionario, 90_000);
        servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
        servicoFinanciamento.solicitarFinanciamento(industria, 400_000);
    }

}