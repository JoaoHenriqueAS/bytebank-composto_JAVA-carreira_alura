
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente joao = new Cliente();
		joao.nome = "Joao Henrique Santos";
		joao.cpf = "480.416.058-26";
		joao.profissao = "Desenvolvedor Java";
		
		Conta contaDoJoao = new Conta();
		contaDoJoao.deposita(100);
		
		contaDoJoao.titular = joao; //associa o cliente joao com a contaDoJoao
		
		System.out.println(contaDoJoao.titular.nome);
		System.out.println(contaDoJoao.titular);
		System.out.println(joao);
		
		
	}

}
