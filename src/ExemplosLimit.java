import java.util.List;
import java.util.stream.Stream;

public class ExemplosLimit {
    // Operação intermediária

    public static void main(String[] args) {
        // Limita a quantidade máxima de pessoas criadas.

        List<Pessoa> lista = new Pessoa().populaPessoas();

        Stream<Pessoa> stream = lista.stream().limit(2);
        stream.forEach(pessoa -> System.out.println(pessoa));
    }
}
