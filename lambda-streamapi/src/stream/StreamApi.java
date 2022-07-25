package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);

        System.out.println("\nSkip\n");
        lista.stream()
                .skip(2)  //Pula os n primeiros indices
                .forEach(e -> System.out.println(e));
        System.out.println("\n---\n");

        System.out.println("\nLimit\n");
        lista.stream()
                .limit(5) //Limita a 'n' primeiros elementos que quero processar
                .forEach(e -> System.out.println(e));
        System.out.println("\n---\n");

        System.out.println("\nDistinct\n");
        lista.stream()
                .distinct() //Nao processa elementos repetidos (Usa equals e Hashcode (Caso use em Objetos seus implemente eles))
                .forEach(e -> System.out.println(e));
        System.out.println("\n---\n");

        System.out.println("\nFilter\n");
        lista.stream()
                .filter(e -> e % 2 == 0) //Retornar o que satisfazer a condicao
                .forEach(e -> System.out.println(e));
        System.out.println("\n---\n");

        System.out.println("\nMap\n");
        lista.stream()
                .map(e -> e + 1) //Aplica a funcao para cada elemento
                .forEach(e -> System.out.println(e));
        System.out.println("\n---\n");

        System.out.println("\nMap com filter\n");
        lista.stream()
                .limit(3)
                .map(e -> e * 2) //Aplica a funcao para cada elemento
                .forEach(e -> System.out.println(e));
        System.out.println("\n---\n");

        System.out.println("\nRetornando dados de um stream\n");

        System.out.println("\nCount\n");
        Long c = lista.stream()
                .map(e -> e * 2)
                .count();
        System.out.println(c);
        System.out.println("\n---\n");

        System.out.println("\nCount numeros pares\n");
        Long cpares = lista.stream()
                .filter(e -> e % 2 == 0)
                .count();
        System.out.println(cpares);
        System.out.println("\n---\n");

        System.out.println("\nColetando o resultado em nova lista\n");
        List<Integer> coletados = lista.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(coletados);
        System.out.println("\n---\n");

        System.out.println("\nColetando o resultado de forma agrupada em nova lista\n");
        Map<Object, List<Integer>> coletadosAgrupados = lista.stream()
                .map(e -> e * 3)
                .collect(Collectors.groupingBy(e -> e % 2 == 0));
        System.out.println(coletadosAgrupados.toString());
        System.out.println("\n---\n");

        System.out.println("\nColetando o resultado de forma agrupada em nova lista 2\n");
        Map<Object, List<Integer>> coletadosAgrupados2 = lista.stream()
                .collect(Collectors.groupingBy(e -> e % 3));
        System.out.println(coletadosAgrupados2.toString());  //{0=[9, 6, 6, 9, 9], 1=[1, 1, 4, 7], 2=[5, 8]}
        System.out.println("\n---\n");








    }
}
