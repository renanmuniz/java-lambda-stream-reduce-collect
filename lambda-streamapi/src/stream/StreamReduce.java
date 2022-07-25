package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4,5,6);

        System.out.println("\nReduce básico\n");
        Optional<Integer> reduce = lista
                .stream()
                .reduce((n1, n2) -> n1 + n2);
        System.out.println(reduce.orElse(0));
        System.out.println("\n- - -\n");

        System.out.println("\nReduce com valor de identidade\n");
        Integer reduceIdentidade = lista
                .stream()
                .reduce(0,(n1, n2) -> n1 + n2);
        System.out.println(reduceIdentidade);
        System.out.println("\n- - -\n");


    }



}
