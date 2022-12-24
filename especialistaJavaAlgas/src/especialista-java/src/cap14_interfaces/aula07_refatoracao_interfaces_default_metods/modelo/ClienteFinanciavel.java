package cap14_interfaces.aula07_refatoracao_interfaces_default_metods.modelo;

public interface ClienteFinanciavel {

    double calcularLimiteAprovado();

    //Java 8
    default double calcularJuros(double valorSolicitado) {
        if (valorSolicitado <= 100_000) {
            return 1.0;
        } else if (valorSolicitado <= 1_000_000) {
            return 1.5;
        }

        return 2.0;
    }

}