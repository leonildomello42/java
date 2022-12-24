package cap14_interfaces.aula02_criando_interface;

import cap14_interfaces.aula02_criando_interface.contaspagar.servico.ServicoContaPagar;
import cap14_interfaces.aula02_criando_interface.pagamento.DocumentoPagavel;

public class Principal {

    public static void main(String[] args) {

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        // TODO Precisamos instanciar um objeto de uma classe que implemente a interface
        DocumentoPagavel documento = null;

        servicoContaPagar.pagar(documento);
    }

}
