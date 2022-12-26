package cap13_polimorfismo_classes_abstratas.aula04_downcasting_referencia;

import cap13_polimorfismo_classes_abstratas.aula04_downcasting_referencia.banco.*;

public class Principal {

    public static void main(String[] args) {
        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaEspecial conta1 = new ContaEspecial(new Titular("João da Silva", "12312312300"),
                1234, 999999, 90);
        conta1.setLimiteChequeEspecial(1000);

        ContaInvestimento conta2 = new ContaInvestimento(new Titular("João da Silva", "12312312300"),
                1234, 999999);
        conta2.depositar(100);
        conta2.creditarRendimentos(10);

        ContaSalario conta3 = new ContaSalario(new Titular("João da Silva", "12312312300"),
                1234, 999999, 18_000);
        conta3.depositar(100);

        caixaEletronico.imprimirDemonstrativo(conta3);
    }

}