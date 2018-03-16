
import java.util.ArrayList;

/**
 *
 * @author Vitor
 */
class SistemaFinanceiro {

    ArrayList<Proposta> gerarProposta(Cliente c) {
        ArrayList<Proposta> propostas = new ArrayList<>();
        
        if (c.getSalario() <= 1000.0) 
            GerarPropostasParaFaixa1(propostas, c.getEmprestimo());
        else if (c.getSalario() <= 5000.0) 
            GerarPropostasParaFaixa2(propostas, c.getEmprestimo());
        else 
            GerarPropostasParaFaixa3(propostas, c.getEmprestimo());
        return propostas;
    }

    public void GerarPropostasParaFaixa3(ArrayList<Proposta> propostas, double valorDoEmprestimo) {
        propostas.add(new Proposta(1.1, valorDoEmprestimo, 2));
        propostas.add(new Proposta(1.3, valorDoEmprestimo, 4));
        propostas.add(new Proposta(1.3, valorDoEmprestimo, 10));
        propostas.add(new Proposta(1.4, valorDoEmprestimo, 20));
    }

    public void GerarPropostasParaFaixa2(ArrayList<Proposta> propostas, double valorDoEmprestimo) {
        propostas.add(new Proposta(1.3, valorDoEmprestimo, 2));
        propostas.add(new Proposta(1.5, valorDoEmprestimo, 4));
        propostas.add(new Proposta(1.5, valorDoEmprestimo, 10));
    }

    public void GerarPropostasParaFaixa1(ArrayList<Proposta> propostas, double valorDoEmprestimo) {
        propostas.add(new Proposta(2, valorDoEmprestimo, 2));
        propostas.add(new Proposta(2, valorDoEmprestimo, 3));
    }
}
