import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExemplosOPtional {
    // Exemplo Terminal

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        Optional<Pessoa> max = lista.stream()
                .max(Comparator.comparing(Pessoa::getIdade));

        // opcão 2
        if (max.isPresent()) {
            System.out.println(max.get());
        }

        max.ifPresent(System.out::println);

        Optional<Pessoa> min = lista.stream()
                .min(Comparator.comparing(Pessoa::getIdade));

        // opcão 2
        if (min.isPresent()) {
            System.out.println(min.get());
        }

        min.ifPresent(System.out::println);
    }
}
