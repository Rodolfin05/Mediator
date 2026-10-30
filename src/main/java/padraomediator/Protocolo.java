package padraomediator;

public class Protocolo implements Setor{

    private static Protocolo instancia = new Protocolo();

    private Protocolo() {}

    public static Protocolo getInstancia() {
        return instancia;
    }

    public String chamarVisitante(String nome) {
        return nome + ", favor comparecer ao Protocolo";
    }
}
