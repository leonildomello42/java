package cap12_heranca.aula15_metodo_equals;

import cap12_heranca.aula15_metodo_equals.banco.Conta;
import cap12_heranca.aula15_metodo_equals.banco.ContaEspecial;
import cap12_heranca.aula15_metodo_equals.banco.Titular;

public class Principal {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312312300");
        Conta conta1 = new Conta(titular, 1234, 999999);
        Conta conta2 = new Conta(titular, 1234, 999999);
        ContaEspecial contaEspecial = new ContaEspecial(titular, 1234, 999999, 90);

        System.out.println(conta1.equals(conta2));
        System.out.println(conta1.equals(contaEspecial));
    }

}