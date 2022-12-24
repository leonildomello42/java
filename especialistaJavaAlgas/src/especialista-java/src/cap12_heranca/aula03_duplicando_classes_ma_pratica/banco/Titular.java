package cap12_heranca.aula03_duplicando_classes_ma_pratica.banco;

import java.util.Objects;

public class Titular {

    private String nome;
    private String cpf;

    public Titular(String nome, String cpf) {
        Objects.requireNonNull(nome);
        Objects.requireNonNull(cpf);

        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

}