package teste;

import main.GeradorDeCodigo;
import org.junit.*;

/**
 *
 * @author Luiz Flávio
 */
public class GeradorDeCodigoTest {

    GeradorDeCodigo gc;

    @Before
    public void init() {
        gc = new GeradorDeCodigo();
    }

    @Test
    public void gerardorDeCodigoCombinacaoTest() {
        String codigo = gc.gerardorDeCodigoCombinacao(2, 1);

        Assert.assertEquals("for(int _1 = 0 ; _1 <= 1; _1++){System.out.print( _1+ \" \\n\");}", codigo);
    }
}
