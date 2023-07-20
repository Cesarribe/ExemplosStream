import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExemplosMap {
    // Operação intermediária

    public static void main(String[] args) {
        // Listando apartir das pessoas, selecionando a idade.
        List<Pessoa> lista = new Pessoa().populaPessoas();

        // Listando apartir da idade.
        Stream<Integer> steam = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade);

        // Tipo de Streams para inteiros, criando um "box" automaticamente, é um pouco mais rápido.
        IntStream steam1 = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .mapToInt(Pessoa::getIdade);
    }
}