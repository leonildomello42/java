package cap11_encapsulamento_beans_records.aula06_boas_pratica_telldontask;

public class Principal {

    public static void main(String[] args) {
        Horario horario = new Horario(10, 55);
//        System.out.printf("%dh%dm", horario.getHora(), horario.getMinuto());
        System.out.println(horario.formatar());
    }

}