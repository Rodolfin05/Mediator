package padraomediator;

public class Pessoa {

    public String visitarProtocolo(String nome) {
        return Recepcao.getInstancia().chamarVisitanteProtocolo(nome);
    }

    public String visitarRH(String nome) {
        return Recepcao.getInstancia().chamarVisitanteRH(nome);
    }
}