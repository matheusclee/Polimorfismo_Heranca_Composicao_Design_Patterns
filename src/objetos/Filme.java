package objetos;


import interfaces.Cargo;

import java.util.ArrayList;
import java.util.List;

public class Filme {
	
	private String nome, descricao;
	private List<Funcionario> funcionarios;
	private List<Cargo> cargos;
	
	public Filme(String nome, String descricao) {
		funcionarios = new ArrayList<Funcionario>();
		cargos = new ArrayList<Cargo>();
		
		this.setNome(nome);
		this.setDescricao(descricao);
	}
	
	public boolean addFuncionario(Funcionario funcionario, Cargo cargo) {
		funcionarios.add(funcionario);
		cargos.add(cargo);
		return true;
	}
	
	public List<Funcionario> getFuncionarios(){
		return funcionarios;
	}
	
	public List<Cargo> getCargos(){
		return cargos;
	}
	
	public String toString() {
		StringBuilder info = new StringBuilder();
		info.append("\n\nCaracterísticas do filme:\n\n");
		info.append("Nome do Filme: " + this.getNome());
		info.append("\nDescrição: " + this.getDescricao() + "\n");
		info.append("\nDiretor(es): " + this.imprimeFuncao("Diretor"));
		info.append("\nRoteirista(s): " + this.imprimeFuncao("Roteirista"));
		info.append("\nCinegrafista(s): " + this.imprimeFuncao("Cinegrafista"));
		info.append("\nElenco: " + this.imprimeFuncao("Ator"));
		return info.toString();
	}
	
	//pesquisa e imprime nome de funcionario da funcao desejada
	private String imprimeFuncao(String funcao) {
		StringBuilder nomes = new StringBuilder();
		for(int i = 0; i < cargos.size(); i++) {
			if(cargos.get(i).funcao() == funcao) {
				nomes.append(funcionarios.get(i).getNome());
				nomes.append("; ");
			}
		}
		return nomes.toString();
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
