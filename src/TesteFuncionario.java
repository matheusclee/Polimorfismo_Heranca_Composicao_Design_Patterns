
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import objetos.Funcionario;

public class TesteFuncionario {
	Funcionario funcionario;

	@Before
	public void criaObjeto() throws Exception {
		funcionario = new Funcionario("Matheus", "12345678912");
	}

	@Test
	public void getCpf() {
		String espera = "12345678912";
		assertEquals(espera, funcionario.getCpf());
	}

	@Test
	public void getNome() {
		String espera = "Matheus";
		assertEquals(espera, funcionario.getNome());
	}

}
