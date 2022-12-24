package cap05_mergulhando_oo.aula36_constantes_sobrescrita;

import static cap05_mergulhando_oo.aula36_constantes_sobrescrita.Visitante.IDADE_MINIMA_ACESSO_IRRESTRITO;

public class Principal {

    public static void main(String[] args) {
        Visitante novoVisitante = new Visitante();
        novoVisitante.nome = "João";
        novoVisitante.idade = 15;

        if (novoVisitante.possuiAcessoRestritoPorIdade()) {
            System.out.printf("Acesso não permitido para menores de %d anos",
                    IDADE_MINIMA_ACESSO_IRRESTRITO);
        } else {
            System.out.println("Acesso liberado");
        }
    }

}