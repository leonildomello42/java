package cap07_wrappers_boxing.aula06_usar_primitivos_a_wrappers;

public class Principal1 {

    public static void main(String[] args) {
        Integer numero1 = 128;
        Integer numero2 = 128;

        // Errado
        System.out.println(numero1 == numero2);

        // Certo
        System.out.println(numero1.equals(numero2));

        // Certo
        System.out.println(numero1.compareTo(numero2) == 0);
    }

}