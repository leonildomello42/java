package cap14_interfaces.aula14_implementando_heranca_interfaces.modelo;

public interface PessoaBonificavel extends ClienteFinanciavel {

    double calcularBonus(double percentualMetaAlcancada);

}
