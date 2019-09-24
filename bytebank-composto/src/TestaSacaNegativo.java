
public class TestaSacaNegativo {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		conta.saca(200);
		
		System.out.println(conta.saca(101));
		
		System.out.println(conta.getSaldo());
		
		//atributos privados não podem ser nem lidos nem modificados por clases que nao seja ela mesmo
	}

}
