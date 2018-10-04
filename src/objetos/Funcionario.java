package objetos;

public class Funcionario {

	private String nome;
	private String cpf;
	private static final int LIMITE_CPF = 11;
	
	public Funcionario (String nome, String cpf) throws Exception{
		this.setNome(nome);
		this.setCpf(cpf);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) throws Exception {
		if(cpf.length() > LIMITE_CPF){
			throw new Exception("Quantidade de caracteres excedida.");
		}else{
			if(soTemNumeros(cpf)){
				this.cpf = cpf;
			}else{
				throw new Exception("CPF inválido, só números são válidos.");
			}
			
		}
	}
	
	private boolean soTemNumeros(String str){
		//cria um array de char
		char[] digitos = str.toCharArray();
		
		boolean soNumeros = true;
		
		for(int i = 0; i < digitos.length; i++){
			if(!Character.isDigit(digitos[i])){
				soNumeros = false;
				break;
			}
		}
		
		return soNumeros;
	}
	
}
