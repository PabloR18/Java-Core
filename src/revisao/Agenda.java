package revisao;

public class Agenda {
	
	//Atributos ou variaveis de classe.
	
	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	
	//Construtor
	
	public Agenda(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	//Gets sets

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String gprivatefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

//	public void setEmail(String email) {
//		this.email = email;
//	}

	public String getEndereco() {
		return endereco;
	}

//	public void setEndereco(String endereco) {
//		this.endereco = endereco;
//	}
	
	public void addEmail(String email) {
		this.email = email;
	}
	
	public void addEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
