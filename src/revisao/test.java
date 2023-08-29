package revisao;

public class test {

	public static void main(String[] args) {
		Agenda minhaAgenda = new Agenda(null, null);
		
		minhaAgenda.setNome("novachrono");
		minhaAgenda.setTelefone("1132131");
		minhaAgenda.addEmail("lucius@time.com");
		minhaAgenda.addEndereco("clover");
		
		System.out.println(minhaAgenda.getNome());

	}

}
