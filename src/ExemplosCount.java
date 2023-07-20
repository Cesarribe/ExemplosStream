import java.util.List;

public class ExemplosCount {
// Operação Terminal.

    public static void main(String[] args) {
        // Conta quantas pessoas tem com determinado valor.

        List<Pessoa> lista = new Pessoa().populaPessoas();

        long count = lista.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("M"))
                .count();

        System.out.println(count);
    }
}
