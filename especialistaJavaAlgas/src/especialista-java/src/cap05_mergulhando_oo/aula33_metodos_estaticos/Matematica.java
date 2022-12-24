package cap05_mergulhando_oo.aula33_metodos_estaticos;

public class Matematica {

    static double calcularAcrescimo(double valor, double percentual) {
        return valor * ((percentual / 100) + 1);
    }

}