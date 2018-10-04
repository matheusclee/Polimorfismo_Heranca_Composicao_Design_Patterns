package objetos;

import interfaces.Cargo;

public class Diretor implements Cargo {

	@Override
	public String realiza() {
		return "Realiza a ativide de direção do filme.";
	}

	@Override
	public String funcao() {
		return "Diretor";
	}

}
