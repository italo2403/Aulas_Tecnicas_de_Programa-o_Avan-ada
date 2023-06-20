import com.sun.javafx.css.CalculatedValue;
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
public class testCalculoSalario {
    
    public testCalculoSalario() {
    }
    @Test
    public void testeFGTS(){
        
        CalcularSalario fg = new CalcularSalario();
       Double retorno = fg.SalarioBruto(3000.00);
        Double fgts = 240.00;
        assertEquals(fgts, retorno);
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
