package dao;

import java.sql.SQLException;
import modelo.Convenio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author John
 */
public class ConvenioDAOTest {

    private ConvenioDAO convenioDao;

    public ConvenioDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        convenioDao = new ConvenioDAO();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of buscarcConvenios method, of class ConvenioDAO.
     */
    @Test
    public void testaIdConvenio() throws SQLException {
        String nome = "Bradesco Saúde";
        Convenio convenio = convenioDao.buscarConvenioFiltro(nome);
        assertEquals(4, convenio.getIdConvenio());

    }

}
