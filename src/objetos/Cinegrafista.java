package objetos;

import interfaces.Cargo;

public class Cinegrafista implements Cargo {

	@Override
	public String realiza() {
		return "Realiza atividade de filmagem do filme.";
	}

	@Override
	public String funcao() {
		// TODO Auto-generated method stub
		return "Cinegrafista";
	}

}
