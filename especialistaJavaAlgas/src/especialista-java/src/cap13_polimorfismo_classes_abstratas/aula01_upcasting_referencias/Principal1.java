package cap13_polimorfismo_classes_abstratas.aula01_upcasting_referencias;

import cap13_polimorfismo_classes_abstratas.aula01_upcasting_referencias.banco.Conta;
import cap13_polimorfismo_classes_abstratas.aula01_upcasting_referencias.banco.ContaEspecial;
import cap13_polimorfismo_classes_abstratas.aula01_upcasting_referencias.banco.Titular;

public class Principal1 {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312312300");
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 999999, 90);
        contaEspecial.setLimiteChequeEspecial(1000);
        contaEspecial.depositar(300);

        contaEspecial.debitarTarifaMensal();

        Conta conta = contaEspecial;

        System.out.println(contaEspecial.getClass().getName());
        System.out.println(conta.getClass().getName());

        System.out.println(contaEspecial == conta);
    }

}