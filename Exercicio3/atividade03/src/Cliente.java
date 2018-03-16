
/**
 *
 * @author Vitor 
 */
public class Cliente {

    String nome;
    int idade;
    double emprestimo, salario;

    public Cliente(String nome, int idade, double emprestimo, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.emprestimo = emprestimo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
