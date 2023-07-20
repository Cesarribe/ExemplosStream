import java.util.List;

public class ExemplosAllMach {
    // Operação Terminal

    public static void main(String[] args) {

        List<Pessoa> lista = new Pessoa().populaPessoas();

        // Método com Stream
        boolean result = lista.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Mexico"));
        System.out.println(result);

        //Método convencional
        Boolean re = true;
        for (Pessoa p : lista) {
            if (!p.getNacionalidade().equals("Mexico")) {
                re=false;
                break;
            }
        }
    }
}