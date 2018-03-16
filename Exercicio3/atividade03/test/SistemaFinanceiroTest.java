

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vitor
 */
public class SistemaFinanceiroTest {
    SistemaFinanceiro sist;
    
    public SistemaFinanceiroTest() {
    }
    
    @Before
    public void setUp() {
        sist = new SistemaFinanceiro();
    }

    @Test
    public void testFaixaAte1000reais() {
        Cliente c = new Cliente("nome", 20, 1000.0, 1000);
        
        ArrayList<Proposta> propostas =  sist.gerarProposta(c);
        assertEquals(2, propostas.size());
        
        Proposta p1 = propostas.get(0);
        assertEquals(2 * 1000.0, p1.getValorTotal(), 0.0000001);
        assertEquals(2, p1.getNumeroDeParcelas());
        assertEquals(2000.0/2, p1.getValorDaParcela(), 0.0000001);
        
        Proposta p2 = propostas.get(1);
        assertEquals(2 * 1000.0, p2.getValorTotal(), 0.0000001);
        assertEquals(3, p2.getNumeroDeParcelas());
        assertEquals(2000.0/3, p2.getValorDaParcela(), 0.0000001);
    }

    @Test
    public void testFaixaAte1001Ate5000reais() {
        Cliente c = new Cliente("nome", 20, 1000.0, 2000);
        
        ArrayList<Proposta> propostas =  sist.gerarProposta(c);
        assertEquals(3, propostas.size());
        
        Proposta p1 = propostas.get(0);
        assertEquals(1.3 * 1000.0, p1.getValorTotal(), 0.0000001);
        assertEquals(2, p1.getNumeroDeParcelas());
        assertEquals(1.3 * 1000.0 / 2, p1.getValorDaParcela(), 0.0000001);
        
        Proposta p2 = propostas.get(1);
        assertEquals(1.5 * 1000.0, p2.getValorTotal(), 0.0000001);
        assertEquals(4, p2.getNumeroDeParcelas());
        assertEquals(1.5 * 1000.0 / 4, p2.getValorDaParcela(), 0.0000001);
        
        Proposta p3 = propostas.get(2);
        assertEquals(1.5 * 1000.0, p3.getValorTotal(), 0.0000001);
        assertEquals(10, p3.getNumeroDeParcelas());
        assertEquals(1.5 * 1000.0 / 10, p3.getValorDaParcela(), 0.0000001);
    }
    
    @Test
    public void testFaixaAcimaDe5000(){
        Cliente c = new Cliente("nome", 20,100.0,7000);
        
        ArrayList<Proposta> propostas =  sist.gerarProposta(c);
        assertEquals(4, propostas.size());
        
        Proposta p1 = propostas.get(0);
        assertEquals(1.1 * 100.0, p1.getValorTotal(), 0.0000001);
        assertEquals(2, p1.getNumeroDeParcelas());
        assertEquals(1.1 * 100.0 / 2, p1.getValorDaParcela(), 0.0000001);
    
        Proposta p2 = propostas.get(1);
        assertEquals(1.3 * 100.0, p2.getValorTotal(), 0.0000001);
        assertEquals(4, p2.getNumeroDeParcelas());
        assertEquals(1.3 * 100.0 / 4, p2.getValorDaParcela(), 0.0000001);
    
        Proposta p3 = propostas.get(2);
        assertEquals(1.3 * 100.0, p3.getValorTotal(), 0.0000001);
        assertEquals(10, p3.getNumeroDeParcelas());
        assertEquals(1.3 * 100.0 / 10, p3.getValorDaParcela(), 0.0000001);
    
        Proposta p4 = propostas.get(3);
        assertEquals(1.4 * 100.0, p4.getValorTotal(), 0.0000001);
        assertEquals(20, p4.getNumeroDeParcelas());
        assertEquals(1.4 * 100.0 / 20, p4.getValorDaParcela(), 0.0000001);
    }   
}
