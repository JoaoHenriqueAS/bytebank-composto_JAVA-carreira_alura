
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		
		Conta contaDaVictoria = new Conta();
		System.out.println(contaDaVictoria.getSaldo());
		
		contaDaVictoria.titular = new Cliente();
		System.out.println(contaDaVictoria.titular);
		
		contaDaVictoria.titular.nome = "Victoria";
		System.out.println(contaDaVictoria.titular.nome);
		
		
	}

}
