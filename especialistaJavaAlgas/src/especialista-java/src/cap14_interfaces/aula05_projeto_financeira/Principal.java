package cap14_interfaces.aula05_projeto_financeira;


import cap14_interfaces.aula05_projeto_financeira.modelo.Fazenda;
import cap14_interfaces.aula05_projeto_financeira.modelo.Industria;
import cap14_interfaces.aula05_projeto_financeira.servico.ServicoFinanciamento;

public class Principal {

    public static void main(String[] args) {
        var servicoFinanciamento = new ServicoFinanciamento();
        var fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5);
        var industria = new Industria("Alimentos da Vovó", 900_000, true);

        servicoFinanciamento.solicitarFinanciamento(fazenda, 600_000);
//        servicoFinanciamento.solicitarFinanciamento(industria, 600_000);
    }

}