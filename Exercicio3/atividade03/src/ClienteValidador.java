
/**
 *
 * @author Vitor
 */
public class ClienteValidador{
    public static void Validar(Cliente c) throws IllegalArgumentException {
        if(c.getNome().trim().equals("")){
            throw new IllegalArgumentException("Nome Vazio.");
        }
        
        if(c.getSalario() < 0){
            throw new IllegalArgumentException("Voce não tem $$");
        }
        
        if(c.getIdade() < 18 || c.getIdade() > 70){
            throw new IllegalArgumentException("Voce esta sendo explorado.");
        }
        
        if(c.getEmprestimo() < 100.0 || c.getEmprestimo() > 100000.0){
            throw new IllegalArgumentException("Impossivel financiar esse valor.");
        }
    }
}
