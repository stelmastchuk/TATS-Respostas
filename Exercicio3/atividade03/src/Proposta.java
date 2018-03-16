

/**
 *
 * @author Vitor
 */
class Proposta {
    double valorTotal, valorDaParcela;
    int numeroDeParcelas;

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorDaParcela() {
        return valorDaParcela;
    }

    public void setValorDaParcela(double valorDaParcela) {
        this.valorDaParcela = valorDaParcela;
    }

    public int getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(int numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public Proposta(double fator, double valorDoEmprestimo, int numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
        valorTotal = fator * valorDoEmprestimo;
        valorDaParcela = valorTotal / numeroDeParcelas;
    }
}
