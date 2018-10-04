package objetos;

public class Sistema {
	
	public static void main(String[] args) throws Exception {
		
		Filmografia filmes = new Filmografia();
		
		
		
		//criando primeiro filme
		Filme filme1 = new Filme("Vingadores", "Loki, o irm�o de Thor, ganha acesso ao poder ilimitado do cubo c�smico ao"
				+ " roub�-lo de dentro das instala��es da S.H.I.E.L.D. \nNick Fury, o diretor desta ag�ncia internacional que mant�m a"
				+ " paz, logo re�ne os �nicos super-her�is que ser�o capazes de defender a Terra de amea�as sem precedentes. \nHomem de Ferro,"
				+ " Capit�o Am�rica, Hulk, Thor, Vi�va Negra e Gavi�o Arqueiro formam o time dos sonhos de Fury, mas eles precisam aprender a"
				+ " colocar os egos de lado e agir como um grupo em prol da humanidade.");
		
		
		
		//adicionando funcionarios do primeiro filme
		filme1.addFuncionario(new Funcionario("Joss Whedon", "11111111111"), new Diretor());
		filme1.addFuncionario(new Funcionario("Scarlett", "22222222222"), new Ator());
		filme1.addFuncionario(new Funcionario("Robert", "33333333333"), new Ator());
		filme1.addFuncionario(new Funcionario("Chris Evans", "44444444444"), new Ator());
		filme1.addFuncionario(new Funcionario("Joe Russo", "55555555555"), new Diretor());
		filme1.addFuncionario(new Funcionario("Zack Penn", "66666666666"), new Roteirista());
		filme1.addFuncionario(new Funcionario("Joss Whedon", "11111111111"), new Roteirista());
		filme1.addFuncionario(new Funcionario("Matheus", "77777777777"), new Cinegrafista());

		
		
		
		//criando segundo filme
		Filme filme2 = new Filme("Guerra Civil", "O ataque de Ultron faz com que os pol�ticos decidam "
				+ "\ncontrolar os Vingadores, j� que seus atos afetam toda a humanidade. "
				+ "\nTal decis�o coloca o Capit�o Am�rica em rota de colis�o com o Homem de Ferro.");
		
		
		
		//adicionando funcionarios do segundo filme
		filme2.addFuncionario(new Funcionario("Joe Russo", "55555555555"), new Diretor());
		filme2.addFuncionario(new Funcionario("Robert", "33333333333"), new Ator());
		filme2.addFuncionario(new Funcionario("Chris Evans", "44444444444"), new Ator());
		filme2.addFuncionario(new Funcionario("Matheus", "77777777777"), new Cinegrafista());
		
		
		
		//imprimindo informa��es dos filmes
		System.out.println(filme1.toString());
		System.out.println(filme2.toString());
		
		//adicionando filmes a Filmografia
		filmes.addFilme(filme1);
		filmes.addFilme(filme2);
		
		
		//imprimindo filmografia de alguns funcionarios
		System.out.println("\n\n" + filmes.imprimeFilmografia("11111111111"));
		System.out.println(filmes.imprimeFilmografia("55555555555"));
		System.out.println(filmes.imprimeFilmografia("77777777777"));
	}
	
}
