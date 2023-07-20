import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemplosFilter {
    // Operação intermediária

    public static void main(String[] args) {
        // Os códigos fazem a mesma coisa, porém esse primeiro é o menos verboso.
        List<Pessoa> lista = new Pessoa().populaPessoas();
        Stream<Pessoa> stream = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));

        // esse código emula o primeiro, porém com uma linha a mais.
        Predicate<Pessoa> pred = pessoa -> pessoa.getNacionalidade().equals("Brasil");
        Stream<Pessoa> stream1 = lista.stream().filter(pred);

        // Esse é o ultimo exemplo, o maior de todos.
        Predicate<Pessoa> pred1 = new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getNacionalidade().equals("Brasil");
            }
        };

        // Códigos iguais novamente, porém o primeiro é menos extenso.
        Stream<Pessoa> stream2 = lista.stream().filter(pred1);

        Stream<Pessoa> stream3 = lista.stream().filter(new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getNacionalidade().equals("Brasil");
            }
        });
    }
}