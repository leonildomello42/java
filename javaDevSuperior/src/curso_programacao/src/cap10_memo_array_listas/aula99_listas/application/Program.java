package cap10_memo_array_listas.aula99_listas.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        list.add(2, "Marco");

        list.removeIf(x -> x.charAt(0) == 'M');

        list.remove("Anna");
        list.remove(1);

        System.out.println(list);
        System.out.println(list.size());

        for (String x : list){
            System.out.println(x);
        }

        list.indexOf("Bob");
        list.indexOf("Marco"); // retorna -1

        List<String> result = list.stream()
                .filter(x -> x.charAt(0)=='A')
                .collect(Collectors.toList());

        String name = list.stream().filter(x -> x.charAt(0)=='A').findFirst().orElse(null);

    }
}
