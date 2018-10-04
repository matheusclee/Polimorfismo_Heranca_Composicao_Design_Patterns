package objetos;

import interfaces.Cargo;

public class Ator implements Cargo {

	@Override
	public String realiza() {
		return "Realiza a atividade de atuação no filme.";
	}

	@Override
	public String funcao() {
		return "Ator";
	}

}
