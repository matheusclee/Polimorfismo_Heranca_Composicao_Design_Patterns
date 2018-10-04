package objetos;

import java.util.ArrayList;
import java.util.List;

import interfaces.Cargo;

public class Filmografia {
	
	private List<Filme> filmes;
	
	public Filmografia(){
		filmes = new ArrayList<Filme>();
	}
	
	public void addFilme(Filme filme){
		filmes.add(filme);
	}
	
	public String imprimeFilmografia(String cpf){
		StringBuilder info = new StringBuilder();
		info.append("Filmografia: \n");
		for(int i = 0; i < filmes.size(); i++){
			List<Funcionario> funcionarios = filmes.get(i).getFuncionarios();
			List<Cargo> cargos = filmes.get(i).getCargos();
			
			for(int j = 0; j < funcionarios.size(); j++){
				if(cpf == funcionarios.get(j).getCpf()){
					info.append(funcionarios.get(j).getNome() + " - " + filmes.get(i).getNome() + " - " + cargos.get(j).funcao() + "\n");
				}
			}
		}
		
		return info.toString();
	}
}
