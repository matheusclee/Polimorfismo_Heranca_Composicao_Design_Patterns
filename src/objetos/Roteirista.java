package objetos;

import interfaces.Cargo;

public class Roteirista implements Cargo {

	@Override
	public String realiza() {
		return "Realiza a atividade de escrita do filme.";
	}

	@Override
	public String funcao() {
		return "Roteirista";
	}

}
