package padraomediator;

public class Recepcao {

    private static Recepcao instancia = new Recepcao();

    private Recepcao() {};

    public static Recepcao getInstancia() {
        return instancia;
    }

    public String chamarVisitanteProtocolo(String nome) {
        return "Seja bem-vindo à Prefeitura.\n"+
               ">>" + Protocolo.getInstancia().chamarVisitante(nome);
    }

    public String chamarVisitanteRH(String nome) {
        return "Seja bem-vindo à Prefeitura.\n"+
               ">>" + RecursosHumanos.getInstancia().chamarVisitante(nome);
    }
}
