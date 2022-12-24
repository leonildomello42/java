package cap12_heranca.aula09_metodos_superclasse_super_object;


import cap12_heranca.aula09_metodos_superclasse_super_object.banco.Conta;
import cap12_heranca.aula09_metodos_superclasse_super_object.banco.Titular;

public class Principal1 {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitular(new Titular("João da Silva", "12312312300"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.sacar(27.5);
        conta1.imprimirDemonstrativo();
    }

}