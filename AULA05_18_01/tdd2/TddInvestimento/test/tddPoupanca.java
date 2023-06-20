
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ítalo Nunes
 */
public class tddPoupanca {
    
    public tddPoupanca() {
    }
    @Test // 
    public void testIvest() { 
    Double valor =1000.00; 
    int tempo =6;
    Double  retorno = 1025.251253128125; //
    Poupanca poup = new Poupanca(valor, tempo);
assertEquals(retorno, poup.simulador());    
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
