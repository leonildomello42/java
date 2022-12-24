package cap14_interfaces.aula03_implementando_interface.contaspagar.servico;


import cap14_interfaces.aula03_implementando_interface.pagamento.Beneficiario;
import cap14_interfaces.aula03_implementando_interface.pagamento.DocumentoPagavel;

public class ServicoContaPagar {

    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if (beneficiario.naoPossuiChavePix()) {
            throw new RuntimeException("Beneficiário não possui chave Pix");
        }

        System.out.printf("DEBUG: Efetuando PIX para %s no valor de %.2f com a chave %s%n",
                beneficiario.getNome(), documento.getValorTotal(), beneficiario.getChavePix());
    }

}
