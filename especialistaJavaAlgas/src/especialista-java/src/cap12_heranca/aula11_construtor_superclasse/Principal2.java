package cap12_heranca.aula11_construtor_superclasse;


import cap12_heranca.aula11_construtor_superclasse.banco.ContaInvestimento;
import cap12_heranca.aula11_construtor_superclasse.banco.Titular;

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