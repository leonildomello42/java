package cap15_tratamento_excecoes.aula173_criando_excecoes.model.exception;

public class DomainException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public DomainException(String msg) {
        super(msg);
    }
}
