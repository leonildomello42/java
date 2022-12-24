package cap14_interfaces.aula13_implementando_multiplas_interfaces.servico;


import cap14_interfaces.aula13_implementando_multiplas_interfaces.modelo.PessoaBonificavel;

public class ServicoPagamentoBonus {

    public void pagar(PessoaBonificavel pessoa, double percentualMetaAlcancada) {
        double valorBonus = pessoa.calcularBonus(percentualMetaAlcancada);

        // aqui teria a implementação da lógica de pagamento
        System.out.printf("DEBUG: Bônus pago no valor de %.2f", valorBonus);
    }

}
