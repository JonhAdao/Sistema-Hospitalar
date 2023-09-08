package dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import modelo.Paciente;
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
public class PacienteDAOTest {

    private PacienteDAO pacienteDao;

    public PacienteDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pacienteDao = new PacienteDAO();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of cadastrarPaciente method, of class PacienteDAO.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testBuscarPaciente() throws Exception {
        ArrayList<Paciente> listaPacientes = pacienteDao.buscarPaciente();
        assertTrue(!listaPacientes.isEmpty());

    }

    @Test
    public void testCadastroPaciente() throws Exception {
        String nome = "Jordy";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date dataNasc = sdf.parse("1992/04/23");

        Paciente pac = new Paciente(9, nome, "Rua Miranda", dataNasc, "(11) 2345-7869", "46789345690", "786768768", "jordy@email.com", 2, "");
        pacienteDao.cadastrarPaciente(pac);

        ArrayList<Paciente> listaPacientes = pacienteDao.buscarPacienteFiltro("WHERE NOME LIKE '%" + nome + "%'");
        assertEquals(nome, listaPacientes.get(0).getNome());

    }

    @Test
    public void testBuscarComFiltro() throws Exception {
        String convenio = "Bradesco Saúde";
        ArrayList<Paciente> listaPacientes = pacienteDao.buscarPacienteFiltro("WHERE P.ID_PACIENTE = 1");
        assertEquals(convenio, listaPacientes.get(0).getNomeConv());

    }

}
