import java.util.List;
import java.util.stream.Stream;

public class ExemploDistinct {
    // Operação intermediária

    public static void main(String[] args) {
        // Visa não permitir a repetição, o Equals e o Hash code estão setados no "Nome" e no "Id"

        List<Pessoa> lista = new Pessoa().populaPessoas();

        Stream<Pessoa> stream = lista.stream().distinct();
    }
}