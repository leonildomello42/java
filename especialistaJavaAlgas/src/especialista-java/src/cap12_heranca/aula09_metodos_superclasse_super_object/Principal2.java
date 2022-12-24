package cap12_heranca.aula09_metodos_superclasse_super_object;


import cap12_heranca.aula09_metodos_superclasse_super_object.banco.ContaInvestimento;
import cap12_heranca.aula09_metodos_superclasse_super_object.banco.Titular;

public class Principal2 {

    public static void main(String[] args) {
        ContaInvestimento conta1 = new ContaInvestimento();
        conta1.setTitular(new Titular("João da Silva", "12312312300"));
        conta1.setAgencia(1234);
        conta1.setNumero(999999);

        conta1.imprimirDemonstrativo();

        conta1.depositar(100);
        conta1.imprimirDemonstrativo();

        conta1.creditarRendimentos(6);
        conta1.imprimirDemonstrativo();
    }

}