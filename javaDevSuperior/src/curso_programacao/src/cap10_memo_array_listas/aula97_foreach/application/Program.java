package cap10_memo_array_listas.aula97_foreach.application;

public class Program {

    public static void main(String[] args) {

        String[] vect = new String[]{"Leonildo", "Karoline", "Kamila", "Wyllames"};

        for (int i=0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("-----------");
        for (String obj : vect) {
            System.out.println(obj);
        }
    }
}
