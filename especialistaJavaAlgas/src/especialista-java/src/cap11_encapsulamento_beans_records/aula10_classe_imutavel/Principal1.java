package cap11_encapsulamento_beans_records.aula10_classe_imutavel;

public class Principal1 {

    public static void main(String[] args) {
        Integer idade = 30;
        Integer novaIdade = idade + 1;

        Horario horario = new Horario(10, 30);
//        horario.setHora(15);
    }

}