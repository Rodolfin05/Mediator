package padraomediator;

public class RecursosHumanos implements Setor{

    private static RecursosHumanos instancia = new RecursosHumanos();

    private RecursosHumanos() {};

    public static RecursosHumanos getInstancia() {
        return instancia;
    }

    public String chamarVisitante(String nome) {
        return nome + ", favor comparecer ao RH";
    }
}
