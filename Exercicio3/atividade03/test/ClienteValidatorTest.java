

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Vitor
 */
public class ClienteValidatorTest {
    
    public ClienteValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testNomeVazio(){
        Cliente c = new Cliente("", 20, 100.0,7000);
        
        ClienteValidador.Validar(c);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testSalarioMenorQueZero(){
        Cliente c = new Cliente("Nome", 20, 100.0, -7000);
        
        ClienteValidador.Validar(c);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIdadeIncorreta(){
        Cliente c = new Cliente("Nome", 10, 100.0, 7000);
        
        ClienteValidador.Validar(c);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testValorDeFinanciamentoIncorreto(){
        Cliente c = new Cliente("Nome", 20, 90.0, 7000);
        
        ClienteValidador.Validar(c);
    }
    
}
