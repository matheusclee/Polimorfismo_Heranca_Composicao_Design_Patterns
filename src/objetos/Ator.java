package objetos;

import interfaces.Cargo;

public class Ator implements Cargo {

	@Override
	public String realiza() {
		return "Realiza a atividade de atua��o no filme.";
	}

	@Override
	public String funcao() {
		return "Ator";
	}

}
