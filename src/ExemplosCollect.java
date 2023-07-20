import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ExemplosCollect {
// Operação Terminal
    public static void main(String[] args) {

        //Coleta elementos de uma Stream e converte para List, Set ou Map.

        List<Pessoa> lista = new Pessoa().populaPessoas();

        // Seleciona os brasileiros e coloca em uma lista.
        List<Pessoa> listaB = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList());

        listaB.forEach(System.out::println);

        System.out.println("************");
        System.out.println("************");

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("************");
        System.out.println("************");

        Set<Pessoa> set = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toSet());

        set.forEach(System.out::println);

        System.out.println("************");
        System.out.println("************");

        ArrayList<Pessoa> arrayList = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toCollection(ArrayList::new));

        arrayList.forEach(System.out::println);

        System.out.println("************");
        System.out.println("************");

//        TreeSet<Pessoa> tree = lista.stream()
//                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
//                .collect(Collectors.toCollection(TreeSet::new));
//
//        tree.forEach(System.out::println);

        Map<Integer, Pessoa> map = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Mexico"))
                .collect(Collectors.toMap(Pessoa::getIdade, Pessoa::new));

        map.forEach((k,v) -> System.out.println(k + " / " + v));

        System.out.println("************");
        System.out.println("************");

        Map<Integer, List<Pessoa>> agrupaPorIdade = lista.stream()
                //.filter(pessoa -> pessoa.getNacionalidade().equals("Mexico"))
                .collect(Collectors.groupingBy(Pessoa::getIdade));

        agrupaPorIdade.forEach((k,v) -> System.out.println(k + " / " + v));
    }
}