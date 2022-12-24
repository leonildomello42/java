package cap13_polimorfismo_classes_abstratas.aula01_upcasting_referencias;


import cap13_polimorfismo_classes_abstratas.aula01_upcasting_referencias.banco.Conta;
import cap13_polimorfismo_classes_abstratas.aula01_upcasting_referencias.banco.ContaSalario;
import cap13_polimorfismo_classes_abstratas.aula01_upcasting_referencias.banco.Titular;

public class Principal2 {

    public static void main(String[] args) {
        Titular titular = new Titular("João da Silva", "12312312300");
        Conta conta = new ContaSalario(titular, 1234, 999999, 18_000);

    }

}