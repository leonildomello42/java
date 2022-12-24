package cap10_memo_array_listas.aula96_box_unbox_wrapper.application;

public class Program {

    public static void main(String[] args) {

        // Boxing: Eh o processo de conversao de um objeto tipo valor para um objeto
        // tipo referencia compativel int -> obj

        // Unboxing: Eh o processo de conversao de um objeto tipo referencia para um
        // objeto tipo valor compativel obj -> int

        int x = 20;

        Object obj = x;

        int y = (int) obj;

        // Wrapper: classes equivalentes aos tipos primitivos

        Integer i;
        Double d;
        Boolean b;
        Byte by;
        Short sh;
        Long lo;
        Float fl;
        Character ch;

        Integer num = 12;
        int num2 = num;

    }
}
